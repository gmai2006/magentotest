import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'optionId', header: 'optionId', defaultFlex: 1 },
  { name: 'wishlistItemId', header: 'wishlistItemId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'value', header: 'value', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'wishlistitemoption/selectAll',{
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

const WishlistItemOption = () => {
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

export default WishlistItemOption;