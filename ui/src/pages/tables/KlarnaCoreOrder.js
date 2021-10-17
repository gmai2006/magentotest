import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'klarnaOrderId', header: 'klarnaOrderId', defaultFlex: 1 },
  { name: 'sessionId', header: 'sessionId', defaultFlex: 1 },
  { name: 'reservationId', header: 'reservationId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'isAcknowledged', header: 'isAcknowledged', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'klarnacoreorder/selectAll',{
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

const KlarnaCoreOrder = () => {
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

export default KlarnaCoreOrder;