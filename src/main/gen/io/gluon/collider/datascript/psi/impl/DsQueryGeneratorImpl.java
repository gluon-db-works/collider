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

public class DsQueryGeneratorImpl extends DsRepoElementImpl implements DsQueryGenerator {

  public DsQueryGeneratorImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull DsVisitor visitor) {
    visitor.visitQueryGenerator(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DsVisitor) accept((DsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DsFetchList getFetchList() {
    return findChildByClass(DsFetchList.class);
  }

  @Override
  @Nullable
  public DsFetchOne getFetchOne() {
    return findChildByClass(DsFetchOne.class);
  }

  @Override
  @Nullable
  public DsFetchStream getFetchStream() {
    return findChildByClass(DsFetchStream.class);
  }

  @Override
  @NotNull
  public DsFullSelect getFullSelect() {
    return findNotNullChildByClass(DsFullSelect.class);
  }

  @Override
  @Nullable
  public DsQueryParametersList getQueryParametersList() {
    return findChildByClass(DsQueryParametersList.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
