import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'period', header: 'period', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'orderStatus', header: 'orderStatus', defaultFlex: 1 },
  { name: 'ordersCount', header: 'ordersCount', defaultFlex: 1 },
  { name: 'refunded', header: 'refunded', defaultFlex: 1 },
  { name: 'onlineRefunded', header: 'onlineRefunded', defaultFlex: 1 },
  { name: 'offlineRefunded', header: 'offlineRefunded', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salesrefundedaggregated/selectAll',{
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

const SalesRefundedAggregated = () => {
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

export default SalesRefundedAggregated;