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

public class DsFullSelectImpl extends ASTWrapperPsiElement implements DsFullSelect {

  public DsFullSelectImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitFullSelect(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DsFromClause getFromClause() {
    return findNotNullChildByClass(DsFromClause.class);
  }

  @Override
  @Nullable
  public DsGroupClause getGroupClause() {
    return findChildByClass(DsGroupClause.class);
  }

  @Override
  @NotNull
  public List<DsJoinClause> getJoinClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DsJoinClause.class);
  }

  @Override
  @Nullable
  public DsOrderClause getOrderClause() {
    return findChildByClass(DsOrderClause.class);
  }

  @Override
  @NotNull
  public DsSelectClause getSelectClause() {
    return findNotNullChildByClass(DsSelectClause.class);
  }

  @Override
  @Nullable
  public DsWhereClause getWhereClause() {
    return findChildByClass(DsWhereClause.class);
  }

}
