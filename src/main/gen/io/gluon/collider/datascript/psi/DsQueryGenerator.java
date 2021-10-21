// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DsQueryGenerator extends DsRepoElement {

  @Nullable
  DsFetchList getFetchList();

  @Nullable
  DsFetchOne getFetchOne();

  @Nullable
  DsFetchStream getFetchStream();

  @NotNull
  DsFullSelect getFullSelect();

  @Nullable
  DsQueryParametersList getQueryParametersList();

  @NotNull
  PsiElement getId();

}
