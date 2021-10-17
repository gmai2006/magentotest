import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'pk', header: 'pk', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'destCountryId', header: 'destCountryId', defaultFlex: 1 },
  { name: 'destRegionId', header: 'destRegionId', defaultFlex: 1 },
  { name: 'destZip', header: 'destZip', defaultFlex: 1 },
  { name: 'conditionName', header: 'conditionName', defaultFlex: 1 },
  { name: 'conditionValue', header: 'conditionValue', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'cost', header: 'cost', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'shippingtablerate/selectAll',{
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

const ShippingTablerate = () => {
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

export default ShippingTablerate;