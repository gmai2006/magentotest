import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'alertStockId', header: 'alertStockId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'addDate', header: 'addDate', defaultFlex: 1 },
  { name: 'sendDate', header: 'sendDate', defaultFlex: 1 },
  { name: 'sendCount', header: 'sendCount', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'productalertstock/selectAll',{
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

const ProductAlertStock = () => {
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

export default ProductAlertStock;