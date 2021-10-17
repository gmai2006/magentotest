import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'ruleProductPriceId', header: 'ruleProductPriceId', defaultFlex: 1 },
  { name: 'ruleDate', header: 'ruleDate', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'rulePrice', header: 'rulePrice', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'latestStartDate', header: 'latestStartDate', defaultFlex: 1 },
  { name: 'earliestEndDate', header: 'earliestEndDate', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogruleproductpricereplica/selectAll',{
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

const CatalogruleProductPriceReplica = () => {
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

export default CatalogruleProductPriceReplica;