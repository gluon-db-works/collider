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

public class DsFromClauseImpl extends ASTWrapperPsiElement implements DsFromClause {

  public DsFromClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitFromClause(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DsEntitySelector> getEntitySelectorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DsEntitySelector.class);
  }

}
