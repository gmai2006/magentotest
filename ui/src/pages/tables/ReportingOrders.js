import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'total', header: 'total', defaultFlex: 1 },
  { name: 'totalBase', header: 'totalBase', defaultFlex: 1 },
  { name: 'itemCount', header: 'itemCount', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'reportingorders/selectAll',{
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

const ReportingOrders = () => {
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

export default ReportingOrders;