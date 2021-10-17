import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'id', header: 'id', defaultFlex: 1 },
  { name: 'emailContactId', header: 'emailContactId', defaultFlex: 1 },
  { name: 'consentUrl', header: 'consentUrl', defaultFlex: 1 },
  { name: 'consentDatetime', header: 'consentDatetime', defaultFlex: 1 },
  { name: 'consentIp', header: 'consentIp', defaultFlex: 1 },
  { name: 'consentUserAgent', header: 'consentUserAgent', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'emailcontactconsent/selectAll',{
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

const EmailContactConsent = () => {
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

export default EmailContactConsent;