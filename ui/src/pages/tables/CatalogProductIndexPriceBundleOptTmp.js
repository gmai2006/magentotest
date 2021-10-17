import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'optionId', header: 'optionId', defaultFlex: 1 },
  { name: 'minPrice', header: 'minPrice', defaultFlex: 1 },
  { name: 'altPrice', header: 'altPrice', defaultFlex: 1 },
  { name: 'maxPrice', header: 'maxPrice', defaultFlex: 1 },
  { name: 'tierPrice', header: 'tierPrice', defaultFlex: 1 },
  { name: 'altTierPrice', header: 'altTierPrice', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogproductindexpricebundleopttmp/selectAll',{
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

const CatalogProductIndexPriceBundleOptTmp = () => {
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

export default CatalogProductIndexPriceBundleOptTmp;