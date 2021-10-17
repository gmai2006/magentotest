import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'queryId', header: 'queryId', defaultFlex: 1 },
  { name: 'queryText', header: 'queryText', defaultFlex: 1 },
  { name: 'numResults', header: 'numResults', defaultFlex: 1 },
  { name: 'popularity', header: 'popularity', defaultFlex: 1 },
  { name: 'redirect', header: 'redirect', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'displayInTerms', header: 'displayInTerms', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'isProcessed', header: 'isProcessed', defaultFlex: 1 },
  { name: 'updatedAt', header: 'updatedAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'searchquery/selectAll',{
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

const SearchQuery = () => {
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

export default SearchQuery;