import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'productLinkAttributeId', header: 'productLinkAttributeId', defaultFlex: 1 },
  { name: 'linkTypeId', header: 'linkTypeId', defaultFlex: 1 },
  { name: 'productLinkAttributeCode', header: 'productLinkAttributeCode', defaultFlex: 1 },
  { name: 'dataType', header: 'dataType', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogproductlinkattribute/selectAll',{
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

const CatalogProductLinkAttribute = () => {
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

export default CatalogProductLinkAttribute;