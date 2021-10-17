import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'entityId', header: 'entityId', defaultFlex: 1 },
  { name: 'consumerId', header: 'consumerId', defaultFlex: 1 },
  { name: 'adminId', header: 'adminId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'token', header: 'token', defaultFlex: 1 },
  { name: 'secret', header: 'secret', defaultFlex: 1 },
  { name: 'verifier', header: 'verifier', defaultFlex: 1 },
  { name: 'callbackUrl', header: 'callbackUrl', defaultFlex: 1 },
  { name: 'revoked', header: 'revoked', defaultFlex: 1 },
  { name: 'authorized', header: 'authorized', defaultFlex: 1 },
  { name: 'userType', header: 'userType', defaultFlex: 1 },
  { name: 'createdAt', header: 'createdAt', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'oauthtoken/selectAll',{
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

const OauthToken = () => {
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

export default OauthToken;