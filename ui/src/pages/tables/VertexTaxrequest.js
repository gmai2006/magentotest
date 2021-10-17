import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'requestId', header: 'requestId', defaultFlex: 1 },
  { name: 'requestType', header: 'requestType', defaultFlex: 1 },
  { name: 'quoteId', header: 'quoteId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'totalTax', header: 'totalTax', defaultFlex: 1 },
  { name: 'sourcePath', header: 'sourcePath', defaultFlex: 1 },
  { name: 'taxAreaId', header: 'taxAreaId', defaultFlex: 1 },
  { name: 'subTotal', header: 'subTotal', defaultFlex: 1 },
  { name: 'total', header: 'total', defaultFlex: 1 },
  { name: 'lookupResult', header: 'lookupResult', defaultFlex: 1 },
  { name: 'requestDate', header: 'requestDate', defaultFlex: 1 },
  { name: 'requestXml', header: 'requestXml', defaultFlex: 1 },
  { name: 'responseXml', header: 'responseXml', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'vertextaxrequest/selectAll',{
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

const VertexTaxrequest = () => {
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

export default VertexTaxrequest;