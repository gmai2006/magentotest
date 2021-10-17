import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'recipientAddressId', header: 'recipientAddressId', defaultFlex: 1 },
  { name: 'collectionPointId', header: 'collectionPointId', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'country', header: 'country', defaultFlex: 1 },
  { name: 'region', header: 'region', defaultFlex: 1 },
  { name: 'postcode', header: 'postcode', defaultFlex: 1 },
  { name: 'city', header: 'city', defaultFlex: 1 },
  { name: 'street', header: 'street', defaultFlex: 1 },
  { name: 'openingHours', header: 'openingHours', defaultFlex: 1 },
  { name: 'shippingExperiences', header: 'shippingExperiences', defaultFlex: 1 },
  { name: 'selected', header: 'selected', defaultFlex: 1 },
  { name: 'distance', header: 'distance', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'temandoquotecollectionpoint/selectAll',{
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

const TemandoQuoteCollectionPoint = () => {
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

export default TemandoQuoteCollectionPoint;