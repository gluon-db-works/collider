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
import null.null;

public class DsDatascriptFileImpl extends ASTWrapperPsiElement implements DsDatascriptFile {

  public DsDatascriptFileImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitDatascriptFile(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DsConnection getConnection() {
    return findChildByClass(DsConnection.class);
  }

  @Override
  @Nullable
  public null getQualifiedName() {
    return findChildByClass(null.class);
  }

  @Override
  @NotNull
  public List<DsRepositoryDefinition> getRepositoryDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DsRepositoryDefinition.class);
  }

}
