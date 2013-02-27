/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.java.scope;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.descriptors.PackageViewDescriptor;
import org.jetbrains.jet.lang.resolve.java.DescriptorSearchRule;
import org.jetbrains.jet.lang.resolve.java.JavaSemanticServices;
import org.jetbrains.jet.lang.resolve.java.provider.ClassPsiDeclarationProvider;
import org.jetbrains.jet.lang.resolve.name.FqName;
import org.jetbrains.jet.lang.resolve.name.Name;

public final class JavaClassStaticMembersScope extends JavaClassMembersScope {
    @NotNull
    private final FqName packageFQN;

    public JavaClassStaticMembersScope(
            @NotNull PackageViewDescriptor descriptor,
            @NotNull ClassPsiDeclarationProvider declarationProvider,
            @NotNull FqName packageFQN,
            @NotNull JavaSemanticServices semanticServices
    ) {
        super(descriptor, declarationProvider, semanticServices);
        this.packageFQN = packageFQN;
    }

    @Override
    public PackageViewDescriptor getPackage(@NotNull Name name) {
        return getResolver().resolveNamespace(packageFQN.child(name), DescriptorSearchRule.INCLUDE_KOTLIN);
    }
}
