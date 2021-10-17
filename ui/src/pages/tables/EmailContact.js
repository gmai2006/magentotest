import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'emailContactId', header: 'emailContactId', defaultFlex: 1 },
  { name: 'isGuest', header: 'isGuest', defaultFlex: 1 },
  { name: 'contactId', header: 'contactId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'isSubscriber', header: 'isSubscriber', defaultFlex: 1 },
  { name: 'subscriberStatus', header: 'subscriberStatus', defaultFlex: 1 },
  { name: 'emailImported', header: 'emailImported', defaultFlex: 1 },
  { name: 'subscriberImported', header: 'subscriberImported', defaultFlex: 1 },
  { name: 'suppressed', header: 'suppressed', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'emailcontact/selectAll',{
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

const EmailContact = () => {
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

export default EmailContact;