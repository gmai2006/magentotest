import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'attributeId', header: 'attributeId', defaultFlex: 1 },
  { name: 'isVisible', header: 'isVisible', defaultFlex: 1 },
  { name: 'inputFilter', header: 'inputFilter', defaultFlex: 1 },
  { name: 'multilineCount', header: 'multilineCount', defaultFlex: 1 },
  { name: 'validateRules', header: 'validateRules', defaultFlex: 1 },
  { name: 'isSystem', header: 'isSystem', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'dataModel', header: 'dataModel', defaultFlex: 1 },
  { name: 'isUsedInGrid', header: 'isUsedInGrid', defaultFlex: 1 },
  { name: 'isVisibleInGrid', header: 'isVisibleInGrid', defaultFlex: 1 },
  { name: 'isFilterableInGrid', header: 'isFilterableInGrid', defaultFlex: 1 },
  { name: 'isSearchableInGrid', header: 'isSearchableInGrid', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'customereavattribute/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const CustomerEavAttribute = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default CustomerEavAttribute;