import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'attributeGroupId', header: 'attributeGroupId', defaultFlex: 1 },
  { name: 'attributeSetId', header: 'attributeSetId', defaultFlex: 1 },
  { name: 'attributeGroupName', header: 'attributeGroupName', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'defaultId', header: 'defaultId', defaultFlex: 1 },
  { name: 'attributeGroupCode', header: 'attributeGroupCode', defaultFlex: 1 },
  { name: 'tabGroupCode', header: 'tabGroupCode', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'eavattributegroup/selectAll',{
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

const EavAttributeGroup = () => {
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

export default EavAttributeGroup;