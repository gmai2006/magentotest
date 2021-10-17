import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'selectionId', header: 'selectionId', defaultFlex: 1 },
  { name: 'optionId', header: 'optionId', defaultFlex: 1 },
  { name: 'parentProductId', header: 'parentProductId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'position', header: 'position', defaultFlex: 1 },
  { name: 'isDefault', header: 'isDefault', defaultFlex: 1 },
  { name: 'selectionPriceType', header: 'selectionPriceType', defaultFlex: 1 },
  { name: 'selectionPriceValue', header: 'selectionPriceValue', defaultFlex: 1 },
  { name: 'selectionQty', header: 'selectionQty', defaultFlex: 1 },
  { name: 'selectionCanChangeQty', header: 'selectionCanChangeQty', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'catalogproductbundleselection/selectAll',{
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

const CatalogProductBundleSelection = () => {
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

export default CatalogProductBundleSelection;