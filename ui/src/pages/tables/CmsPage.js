import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'pageId', header: 'pageId', defaultFlex: 1 },
  { name: 'title', header: 'title', defaultFlex: 1 },
  { name: 'pageLayout', header: 'pageLayout', defaultFlex: 1 },
  { name: 'metaKeywords', header: 'metaKeywords', defaultFlex: 1 },
  { name: 'metaDescription', header: 'metaDescription', defaultFlex: 1 },
  { name: 'identifier', header: 'identifier', defaultFlex: 1 },
  { name: 'contentHeading', header: 'contentHeading', defaultFlex: 1 },
  { name: 'content', header: 'content', defaultFlex: 1 },
  { name: 'creationTime', header: 'creationTime', defaultFlex: 1 },
  { name: 'updateTime', header: 'updateTime', defaultFlex: 1 },
  { name: 'isActive', header: 'isActive', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'layoutUpdateXml', header: 'layoutUpdateXml', defaultFlex: 1 },
  { name: 'customTheme', header: 'customTheme', defaultFlex: 1 },
  { name: 'customRootTemplate', header: 'customRootTemplate', defaultFlex: 1 },
  { name: 'customLayoutUpdateXml', header: 'customLayoutUpdateXml', defaultFlex: 1 },
  { name: 'customThemeFrom', header: 'customThemeFrom', defaultFlex: 1 },
  { name: 'customThemeTo', header: 'customThemeTo', defaultFlex: 1 },
  { name: 'metaTitle', header: 'metaTitle', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'cmspage/selectAll',{
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

const CmsPage = () => {
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

export default CmsPage;