#!/bin/bash
pid=$(ps -ef|grep $1 | grep -v grep | awk 'NR==1''{print $2}')
echo $pid
if [ ! $pid  ];then
    echo "服务不存在"
else
    kill -9 $pid
        echo "服务已结束"
fi 
echo "服务开始启动"
nohup java -jar -Dfile.encoding=UTF-8 -Dloggin.level.root=info $1>/dev/null 2>& 1 &