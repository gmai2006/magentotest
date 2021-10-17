import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'attributeId', header: 'attributeId', defaultFlex: 1 },
  { name: 'entityTypeId', header: 'entityTypeId', defaultFlex: 1 },
  { name: 'attributeCode', header: 'attributeCode', defaultFlex: 1 },
  { name: 'attributeModel', header: 'attributeModel', defaultFlex: 1 },
  { name: 'backendModel', header: 'backendModel', defaultFlex: 1 },
  { name: 'backendType', header: 'backendType', defaultFlex: 1 },
  { name: 'backendTable', header: 'backendTable', defaultFlex: 1 },
  { name: 'frontendModel', header: 'frontendModel', defaultFlex: 1 },
  { name: 'frontendInput', header: 'frontendInput', defaultFlex: 1 },
  { name: 'frontendLabel', header: 'frontendLabel', defaultFlex: 1 },
  { name: 'frontendClass', header: 'frontendClass', defaultFlex: 1 },
  { name: 'sourceModel', header: 'sourceModel', defaultFlex: 1 },
  { name: 'isRequired', header: 'isRequired', defaultFlex: 1 },
  { name: 'isUserDefined', header: 'isUserDefined', defaultFlex: 1 },
  { name: 'defaultValue', header: 'defaultValue', defaultFlex: 1 },
  { name: 'isUnique', header: 'isUnique', defaultFlex: 1 },
  { name: 'note', header: 'note', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'eavattribute/selectAll',{
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

const EavAttribute = () => {
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

export default EavAttribute;