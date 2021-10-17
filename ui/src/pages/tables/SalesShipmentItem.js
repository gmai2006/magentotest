import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'parentId', header: 'parentId', defaultFlex: 1 },
  { name: 'rowTotal', header: 'rowTotal', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'qty', header: 'qty', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'orderItemId', header: 'orderItemId', defaultFlex: 1 },
  { name: 'additionalData', header: 'additionalData', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'sku', header: 'sku', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesshipmentitem/selectAll',{
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

const SalesShipmentItem = () => {
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

export default SalesShipmentItem;