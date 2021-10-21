// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.gluon.collider.datascript.psi.DatascriptTypes.*;
import io.gluon.collider.datascript.psi.*;

public class DsSqlCountFunctionExpressionImpl extends DsSqlExpressionImpl implements DsSqlCountFunctionExpression {

  public DsSqlCountFunctionExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitSqlCountFunctionExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DsSqlExpression getSqlExpression() {
    return findChildByClass(DsSqlExpression.class);
  }

}
