// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.gluon.collider.datascript.psi.DatascriptTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.gluon.collider.datascript.psi.*;

public class DsGroupClauseImpl extends ASTWrapperPsiElement implements DsGroupClause {

  public DsGroupClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitGroupClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DsHavingClause getHavingClause() {
    return findChildByClass(DsHavingClause.class);
  }

  @Override
  @NotNull
  public List<DsSqlExpression> getSqlExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DsSqlExpression.class);
  }

}
