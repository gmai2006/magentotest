import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'itemId', header: 'itemId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'stockId', header: 'stockId', defaultFlex: 1 },
  { name: 'qty', header: 'qty', defaultFlex: 1 },
  { name: 'minQty', header: 'minQty', defaultFlex: 1 },
  { name: 'useConfigMinQty', header: 'useConfigMinQty', defaultFlex: 1 },
  { name: 'isQtyDecimal', header: 'isQtyDecimal', defaultFlex: 1 },
  { name: 'backorders', header: 'backorders', defaultFlex: 1 },
  { name: 'useConfigBackorders', header: 'useConfigBackorders', defaultFlex: 1 },
  { name: 'minSaleQty', header: 'minSaleQty', defaultFlex: 1 },
  { name: 'useConfigMinSaleQty', header: 'useConfigMinSaleQty', defaultFlex: 1 },
  { name: 'maxSaleQty', header: 'maxSaleQty', defaultFlex: 1 },
  { name: 'useConfigMaxSaleQty', header: 'useConfigMaxSaleQty', defaultFlex: 1 },
  { name: 'isInStock', header: 'isInStock', defaultFlex: 1 },
  { name: 'lowStockDate', header: 'lowStockDate', defaultFlex: 1 },
  { name: 'notifyStockQty', header: 'notifyStockQty', defaultFlex: 1 },
  { name: 'useConfigNotifyStockQty', header: 'useConfigNotifyStockQty', defaultFlex: 1 },
  { name: 'manageStock', header: 'manageStock', defaultFlex: 1 },
  { name: 'useConfigManageStock', header: 'useConfigManageStock', defaultFlex: 1 },
  { name: 'stockStatusChangedAuto', header: 'stockStatusChangedAuto', defaultFlex: 1 },
  { name: 'useConfigQtyIncrements', header: 'useConfigQtyIncrements', defaultFlex: 1 },
  { name: 'qtyIncrements', header: 'qtyIncrements', defaultFlex: 1 },
  { name: 'useConfigEnableQtyInc', header: 'useConfigEnableQtyInc', defaultFlex: 1 },
  { name: 'enableQtyIncrements', header: 'enableQtyIncrements', defaultFlex: 1 },
  { name: 'isDecimalDivided', header: 'isDecimalDivided', defaultFlex: 1 },
  { name: 'websiteId', header: 'websiteId', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'cataloginventorystockitem/selectAll',{
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

const CataloginventoryStockItem = () => {
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

export default CataloginventoryStockItem;