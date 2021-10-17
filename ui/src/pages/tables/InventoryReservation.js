import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'reservationId', header: 'reservationId', defaultFlex: 1 },
  { name: 'stockId', header: 'stockId', defaultFlex: 1 },
  { name: 'sku', header: 'sku', defaultFlex: 1 },
  { name: 'quantity', header: 'quantity', defaultFlex: 1 },
  { name: 'metadata', header: 'metadata', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'inventoryreservation/selectAll',{
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

const InventoryReservation = () => {
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

export default InventoryReservation;