<#list  table.allColumns as column>
<#list column.jdbcTypeInformation.fullyQualifiedJavaType.importList as importStr>
${importStr}
</#list>
</#list>

${table.primaryKeyColumns[0].columnNameLower}

<#list  table.allColumns as column>
 ${column.columnNameLower}
</#list>