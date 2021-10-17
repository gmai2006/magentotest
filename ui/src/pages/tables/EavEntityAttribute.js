import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityAttributeId', header: 'entityAttributeId', defaultFlex: 1 },
  { name: 'entityTypeId', header: 'entityTypeId', defaultFlex: 1 },
  { name: 'attributeSetId', header: 'attributeSetId', defaultFlex: 1 },
  { name: 'attributeGroupId', header: 'attributeGroupId', defaultFlex: 1 },
  { name: 'attributeId', header: 'attributeId', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'eaventityattribute/selectAll',{
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

const EavEntityAttribute = () => {
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

export default EavEntityAttribute;