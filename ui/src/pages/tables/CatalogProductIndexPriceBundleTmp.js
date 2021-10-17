import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'taxClassId', header: 'taxClassId', defaultFlex: 1 },
  { name: 'priceType', header: 'priceType', defaultFlex: 1 },
  { name: 'specialPrice', header: 'specialPrice', defaultFlex: 1 },
  { name: 'tierPercent', header: 'tierPercent', defaultFlex: 1 },
  { name: 'origPrice', header: 'origPrice', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'minPrice', header: 'minPrice', defaultFlex: 1 },
  { name: 'maxPrice', header: 'maxPrice', defaultFlex: 1 },
  { name: 'tierPrice', header: 'tierPrice', defaultFlex: 1 },
  { name: 'baseTier', header: 'baseTier', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogproductindexpricebundletmp/selectAll',{
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

const CatalogProductIndexPriceBundleTmp = () => {
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

export default CatalogProductIndexPriceBundleTmp;