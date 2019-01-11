/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.fir.visitors

import org.jetbrains.kotlin.fir.*
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.expressions.*
import org.jetbrains.kotlin.fir.types.*


/** This file generated by :compiler:fir:tree:generateVisitors. DO NOT MODIFY MANUALLY! */
abstract class FirVisitor<out R, in D> {
    abstract fun visitElement(element: FirElement, data: D): R

    open fun visitCatch(catch: FirCatch, data: D): R {
        return visitElement(catch, data)
    }

    open fun visitDeclaration(declaration: FirDeclaration, data: D): R {
        return visitElement(declaration, data)
    }

    open fun visitCallableMember(callableMember: FirCallableMember, data: D): R {
        return visitDeclaration(callableMember, data)
    }

    open fun visitDeclarationWithBody(declarationWithBody: FirDeclarationWithBody, data: D): R {
        return visitDeclaration(declarationWithBody, data)
    }

    open fun visitAnonymousInitializer(anonymousInitializer: FirAnonymousInitializer, data: D): R {
        return visitDeclarationWithBody(anonymousInitializer, data)
    }

    open fun visitFunction(function: FirFunction, data: D): R {
        return visitDeclarationWithBody(function, data)
    }

    open fun visitConstructor(constructor: FirConstructor, data: D): R {
        return visitFunction(constructor, data)
    }

    open fun visitNamedFunction(namedFunction: FirNamedFunction, data: D): R {
        return visitFunction(namedFunction, data)
    }

    open fun visitPropertyAccessor(propertyAccessor: FirPropertyAccessor, data: D): R {
        return visitFunction(propertyAccessor, data)
    }

    open fun visitErrorDeclaration(errorDeclaration: FirErrorDeclaration, data: D): R {
        return visitDeclaration(errorDeclaration, data)
    }

    open fun visitNamedDeclaration(namedDeclaration: FirNamedDeclaration, data: D): R {
        return visitDeclaration(namedDeclaration, data)
    }

    open fun visitMemberDeclaration(memberDeclaration: FirMemberDeclaration, data: D): R {
        return visitNamedDeclaration(memberDeclaration, data)
    }

    open fun visitClass(klass: FirClass, data: D): R {
        return visitMemberDeclaration(klass, data)
    }

    open fun visitEnumEntry(enumEntry: FirEnumEntry, data: D): R {
        return visitClass(enumEntry, data)
    }

    open fun visitTypeAlias(typeAlias: FirTypeAlias, data: D): R {
        return visitMemberDeclaration(typeAlias, data)
    }

    open fun visitTypeParameter(typeParameter: FirTypeParameter, data: D): R {
        return visitNamedDeclaration(typeParameter, data)
    }

    open fun visitProperty(property: FirProperty, data: D): R {
        return visitDeclaration(property, data)
    }

    open fun visitTypedDeclaration(typedDeclaration: FirTypedDeclaration, data: D): R {
        return visitDeclaration(typedDeclaration, data)
    }

    open fun visitValueParameter(valueParameter: FirValueParameter, data: D): R {
        return visitDeclaration(valueParameter, data)
    }

    open fun visitVariable(variable: FirVariable, data: D): R {
        return visitDeclaration(variable, data)
    }

    open fun visitDeclarationStatus(declarationStatus: FirDeclarationStatus, data: D): R {
        return visitElement(declarationStatus, data)
    }

    open fun visitResolvedDeclarationStatus(resolvedDeclarationStatus: FirResolvedDeclarationStatus, data: D): R {
        return visitDeclarationStatus(resolvedDeclarationStatus, data)
    }

    open fun visitImport(import: FirImport, data: D): R {
        return visitElement(import, data)
    }

    open fun visitResolvedImport(resolvedImport: FirResolvedImport, data: D): R {
        return visitImport(resolvedImport, data)
    }

    open fun visitLabel(label: FirLabel, data: D): R {
        return visitElement(label, data)
    }

    open fun visitMemberReference(memberReference: FirMemberReference, data: D): R {
        return visitElement(memberReference, data)
    }

    open fun visitPackageFragment(packageFragment: FirPackageFragment, data: D): R {
        return visitElement(packageFragment, data)
    }

    open fun visitFile(file: FirFile, data: D): R {
        return visitPackageFragment(file, data)
    }

    open fun visitStatement(statement: FirStatement, data: D): R {
        return visitElement(statement, data)
    }

    open fun visitExpression(expression: FirExpression, data: D): R {
        return visitStatement(expression, data)
    }

    open fun visitBlock(block: FirBlock, data: D): R {
        return visitExpression(block, data)
    }

    open fun visitCall(call: FirCall, data: D): R {
        return visitExpression(call, data)
    }

    open fun visitAnnotationCall(annotationCall: FirAnnotationCall, data: D): R {
        return visitCall(annotationCall, data)
    }

    open fun visitDelegatedConstructorCall(delegatedConstructorCall: FirDelegatedConstructorCall, data: D): R {
        return visitCall(delegatedConstructorCall, data)
    }

    open fun visitMemberAccess(memberAccess: FirMemberAccess, data: D): R {
        return visitCall(memberAccess, data)
    }

    open fun visitPropertyAccess(propertyAccess: FirPropertyAccess, data: D): R {
        return visitMemberAccess(propertyAccess, data)
    }

    open fun <T> visitConstExpression(constExpression: FirConstExpression<T>, data: D): R {
        return visitExpression(constExpression, data)
    }

    open fun visitErrorExpression(errorExpression: FirErrorExpression, data: D): R {
        return visitExpression(errorExpression, data)
    }

    open fun <E : FirTargetElement> visitJump(jump: FirJump<E>, data: D): R {
        return visitExpression(jump, data)
    }

    open fun visitThrowExpression(throwExpression: FirThrowExpression, data: D): R {
        return visitExpression(throwExpression, data)
    }

    open fun visitTryExpression(tryExpression: FirTryExpression, data: D): R {
        return visitExpression(tryExpression, data)
    }

    open fun visitWhenExpression(whenExpression: FirWhenExpression, data: D): R {
        return visitExpression(whenExpression, data)
    }

    open fun visitLoop(loop: FirLoop, data: D): R {
        return visitStatement(loop, data)
    }

    open fun visitForLoop(forLoop: FirForLoop, data: D): R {
        return visitLoop(forLoop, data)
    }

    open fun visitLoopWithCondition(loopWithCondition: FirLoopWithCondition, data: D): R {
        return visitLoop(loopWithCondition, data)
    }

    open fun visitDoWhileLoop(doWhileLoop: FirDoWhileLoop, data: D): R {
        return visitLoopWithCondition(doWhileLoop, data)
    }

    open fun visitWhileLoop(whileLoop: FirWhileLoop, data: D): R {
        return visitLoopWithCondition(whileLoop, data)
    }

    open fun visitTargetElement(targetElement: FirTargetElement, data: D): R {
        return visitElement(targetElement, data)
    }

    open fun visitLabeledElement(labeledElement: FirLabeledElement, data: D): R {
        return visitTargetElement(labeledElement, data)
    }

    open fun visitType(type: FirType, data: D): R {
        return visitElement(type, data)
    }

    open fun visitDelegatedType(delegatedType: FirDelegatedType, data: D): R {
        return visitType(delegatedType, data)
    }

    open fun visitErrorType(errorType: FirErrorType, data: D): R {
        return visitType(errorType, data)
    }

    open fun visitImplicitType(implicitType: FirImplicitType, data: D): R {
        return visitType(implicitType, data)
    }

    open fun visitTypeWithNullability(typeWithNullability: FirTypeWithNullability, data: D): R {
        return visitType(typeWithNullability, data)
    }

    open fun visitDynamicType(dynamicType: FirDynamicType, data: D): R {
        return visitTypeWithNullability(dynamicType, data)
    }

    open fun visitFunctionType(functionType: FirFunctionType, data: D): R {
        return visitTypeWithNullability(functionType, data)
    }

    open fun visitResolvedType(resolvedType: FirResolvedType, data: D): R {
        return visitTypeWithNullability(resolvedType, data)
    }

    open fun visitResolvedFunctionType(resolvedFunctionType: FirResolvedFunctionType, data: D): R {
        return visitResolvedType(resolvedFunctionType, data)
    }

    open fun visitUserType(userType: FirUserType, data: D): R {
        return visitTypeWithNullability(userType, data)
    }

    open fun visitTypeProjection(typeProjection: FirTypeProjection, data: D): R {
        return visitElement(typeProjection, data)
    }

    open fun visitStarProjection(starProjection: FirStarProjection, data: D): R {
        return visitTypeProjection(starProjection, data)
    }

    open fun visitTypeProjectionWithVariance(typeProjectionWithVariance: FirTypeProjectionWithVariance, data: D): R {
        return visitTypeProjection(typeProjectionWithVariance, data)
    }

    open fun visitWhenBranch(whenBranch: FirWhenBranch, data: D): R {
        return visitElement(whenBranch, data)
    }

}
