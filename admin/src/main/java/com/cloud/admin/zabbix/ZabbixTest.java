package com.cloud.admin.zabbix;

/**
 * @author zhangqiao
 * @date 2020/1/16 17:17
 */
public class ZabbixTest {
    public static void main(String[] args){
        try {
            ZabbixUtil zabbixUtil = new ZabbixUtil("Admin","zabbix","http://129.211.51.6/zabbix/api_jsonrpc.php");
            //zabbixUtil.getItemList();
            //System.out.println(zabbixUtil.getHostGroupList());
            //System.out.println(zabbixUtil.getHostByGroupid(4));
            //System.out.println(zabbixUtil.getTriggerInfoList());
            //System.out.println(zabbixUtil.getItemLists("10084"));
            System.out.println(zabbixUtil.getItemData("23305"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
