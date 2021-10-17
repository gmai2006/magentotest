import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'shipmentId', header: 'shipmentId', defaultFlex: 1 },
  { name: 'extShipmentId', header: 'extShipmentId', defaultFlex: 1 },
  { name: 'extLocationId', header: 'extLocationId', defaultFlex: 1 },
  { name: 'extTrackingUrl', header: 'extTrackingUrl', defaultFlex: 1 },
  { name: 'extTrackingReference', header: 'extTrackingReference', defaultFlex: 1 },
  { name: 'extReturnShipmentId', header: 'extReturnShipmentId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'temandoshipment/selectAll',{
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

const TemandoShipment = () => {
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

export default TemandoShipment;