${table.tableName}

${table.primaryKeyColumns[0].columnNameLower}

<#list  table.allColumns as column>
 ${column.columnNameLower}
</#list>