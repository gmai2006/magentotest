import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'profileId', header: 'profileId', defaultFlex: 1 },
  { name: 'metaId', header: 'metaId', defaultFlex: 1 },
  { name: 'prefix', header: 'prefix', defaultFlex: 1 },
  { name: 'suffix', header: 'suffix', defaultFlex: 1 },
  { name: 'startValue', header: 'startValue', defaultFlex: 1 },
  { name: 'step', header: 'step', defaultFlex: 1 },
  { name: 'maxValue', header: 'maxValue', defaultFlex: 1 },
  { name: 'warningValue', header: 'warningValue', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'salessequenceprofile/selectAll',{
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

const SalesSequenceProfile = () => {
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

export default SalesSequenceProfile;