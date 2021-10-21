// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import null.null;

public interface DsJoinClause extends PsiElement {

  @NotNull
  DsAliasClause getAliasClause();

  @Nullable
  null getQualifiedName();

  @NotNull
  DsSqlExpression getSqlExpression();

  @Nullable
  DsSubSelect getSubSelect();

}
