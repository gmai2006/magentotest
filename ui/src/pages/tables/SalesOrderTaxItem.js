import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'taxItemId', header: 'taxItemId', defaultFlex: 1 },
  { name: 'taxId', header: 'taxId', defaultFlex: 1 },
  { name: 'itemId', header: 'itemId', defaultFlex: 1 },
  { name: 'taxPercent', header: 'taxPercent', defaultFlex: 1 },
  { name: 'amount', header: 'amount', defaultFlex: 1 },
  { name: 'baseAmount', header: 'baseAmount', defaultFlex: 1 },
  { name: 'realAmount', header: 'realAmount', defaultFlex: 1 },
  { name: 'realBaseAmount', header: 'realBaseAmount', defaultFlex: 1 },
  { name: 'associatedItemId', header: 'associatedItemId', defaultFlex: 1 },
  { name: 'taxableItemType', header: 'taxableItemType', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesordertaxitem/selectAll',{
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

const SalesOrderTaxItem = () => {
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

export default SalesOrderTaxItem;