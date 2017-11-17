package bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/16 0016.
 */

public class BokeBean extends BasePageBean<BokeBean.ResultBean.ItemsBean>{

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"ios122","body":"背景介绍 我有一个习惯，定闹钟每隔60分钟左右，提醒自己休息一次。我发...","commentCount":2,"href":"https://my.oschina.net/ios122/blog/1574239","id":1574239,"original":true,"pubDate":"2017-11-16 00:54:20","recommend":true,"title":"【树莓派自动化应用实例】整点提醒自己休息五分钟","type":3,"viewCount":76},{"author":"老司机带你撸代码","body":"前言 \u2003\u2003笔者学习一门知识有一个习惯，就是会先去了解这门知识的一个大...","commentCount":0,"href":"https://my.oschina.net/lsjcoder/blog/1574229","id":1574229,"original":true,"pubDate":"2017-11-15 23:56:48","recommend":true,"title":"前端编年史","type":3,"viewCount":44},{"author":"温安适","body":"1.为什么选择zookeepr+leveldb,构建activemq主从集群 官网关于主从集群的...","commentCount":7,"href":"https://my.oschina.net/floor/blog/1574213","id":1574213,"original":true,"pubDate":"2017-11-15 23:11:54","recommend":true,"title":"基于zookeeper+leveldb的activemq集群","type":3,"viewCount":60},{"author":"WaltonWang","body":"Author: xidianwangtao@gmail.com 注意事项 截止Kubernetes 1.8版本： ...","commentCount":3,"href":"https://my.oschina.net/jxcdwangtao/blog/1574199","id":1574199,"original":true,"pubDate":"2017-11-15 22:25:01","recommend":true,"title":"如何在Kubernetes集群中利用GPU进行AI训练","type":3,"viewCount":72},{"author":"quanke_","body":"本节介绍以下 CRUD API： 单文档 APIs Index API Get API Delete API De...","commentCount":0,"href":"https://my.oschina.net/quanke/blog/1574188","id":1574188,"original":true,"pubDate":"2017-11-15 21:44:36","recommend":true,"title":"Elasticsearch Java API 索引的增删改查（二）","type":3,"viewCount":41},{"author":"Ann子尘","body":"上节我们使用node.js搭建了属于自己的第一个后端服务，但是只能将当前发...","commentCount":0,"href":"https://my.oschina.net/babyanzichen/blog/1574155","id":1574155,"original":true,"pubDate":"2017-11-15 19:53:03","recommend":true,"title":"一步一步教您用websocket+nodeJS搭建简易聊天室(3)","type":3,"viewCount":45},{"author":"woshiwufeng","body":"网站开发开发大致分为前端和后端，前端主要负责实现视觉和交互效果，以及...","commentCount":0,"href":"https://my.oschina.net/u/3728169/blog/1574142","id":1574142,"original":true,"pubDate":"2017-11-15 19:13:04","recommend":true,"title":"零基础的前端开发初学者应如何系统地学习？","type":3,"viewCount":29},{"author":"Java团长","body":"引言 Java泛型是jdk1.5中引入的一个新特性，泛型提供了编译时的类型检测...","commentCount":0,"href":"https://my.oschina.net/u/3721254/blog/1574131","id":1574131,"original":true,"pubDate":"2017-11-15 18:43:41","recommend":true,"title":"Java泛型详解","type":3,"viewCount":109},{"author":"听风的小猪","body":"一、虚拟主机 RabbitMQ服务器可以创建虚拟主机，它能拥有自己的队列、绑...","commentCount":0,"href":"https://my.oschina.net/zhangyangyang/blog/1574126","id":1574126,"original":true,"pubDate":"2017-11-15 18:27:56","recommend":true,"title":"RabbitMQ系列二：管理RabbitMQ","type":3,"viewCount":99},{"author":"GermanWifi","body":"实验案例由 Luca Sinico (InfoCamere 软件开发人员) 负责编写  实验概述...","commentCount":0,"href":"https://my.oschina.net/u/3491128/blog/1574125","id":1574125,"original":true,"pubDate":"2017-11-15 18:24:00","recommend":true,"title":"图数据库与关系数据库的实验对比\u2014\u2014意大利商会 InfoCamere 案例","type":3,"viewCount":37},{"author":"Java团长","body":"本文着重介绍了 Java 异常选择和使用中的一些误区，希望各位读者能够熟练...","commentCount":0,"href":"https://my.oschina.net/u/3721254/blog/1574091","id":1574091,"original":true,"pubDate":"2017-11-15 17:24:57","recommend":true,"title":"Java异常处理的误区和经验总结","type":3,"viewCount":90},{"author":"听风的小猪","body":"一、基本介绍 RabbitMQ是一个实现了AMQP协议（是一个异步消息传递所使用...","commentCount":2,"href":"https://my.oschina.net/zhangyangyang/blog/1574086","id":1574086,"original":true,"pubDate":"2017-11-15 17:20:39","recommend":true,"title":"RabbitMQ系列一：初识RabbitMQ","type":3,"viewCount":157},{"author":"Mr_Qi","body":"背景 提到SpringBoot各位开发者大概能想到一些标签 \u201c新\u201d \u201c快\u201d \u201cFat...","commentCount":0,"href":"https://my.oschina.net/qixiaobo025/blog/1574084","id":1574084,"original":true,"pubDate":"2017-11-15 17:20:33","recommend":true,"title":"SpringBoot之自动配置","type":3,"viewCount":117},{"author":"woshiwufeng","body":"哎哎 1、鼠标移进网页里，不见了= = *{\n    cursor: none!important;\n}\n...","commentCount":0,"href":"https://my.oschina.net/u/3728169/blog/1574078","id":1574078,"original":true,"pubDate":"2017-11-15 17:17:11","recommend":true,"title":"新手玩CSS中的一些黑科技","type":3,"viewCount":85},{"author":"EACDY","body":"本文搭建一个三节点的Kafka集群。该集群有三个Zookeeper、三个Kafka Bro...","commentCount":0,"href":"https://my.oschina.net/eacdy/blog/1574016","id":1574016,"original":true,"pubDate":"2017-11-15 16:13:24","recommend":true,"title":"kafka_2.11-0.11.0.1集群搭建","type":3,"viewCount":77},{"author":"阿浩yohann","body":"##Vue之父子兄弟组件间通信 @(JavaScript)[学习笔记] [TOC] 导言 最近在...","commentCount":0,"href":"https://my.oschina.net/u/3328758/blog/1573927","id":1573927,"original":true,"pubDate":"2017-11-15 14:48:45","recommend":true,"title":"Vue之父子兄弟组件间通信","type":3,"viewCount":51},{"author":"Mr_Qi","body":"背景 目前多配置来说基本也是开发最常见的场景之一。 以F6来说目前我们存...","commentCount":0,"href":"https://my.oschina.net/qixiaobo025/blog/1573908","id":1573908,"original":true,"pubDate":"2017-11-15 14:25:31","recommend":true,"title":"maven profile VS spring profile","type":3,"viewCount":47},{"author":"巨杉数据库","body":"  近年来，全球金融科技每年的投入已经超过500亿美元，中国的金融科技发...","commentCount":0,"href":"https://my.oschina.net/wangzhonnew/blog/1573905","id":1573905,"original":true,"pubDate":"2017-11-15 14:23:28","recommend":true,"title":"金融级数据库的未来发展方向","type":3,"viewCount":111},{"author":"小麦苗","body":"ipcs、ipcrm、sysresv、kernel.shmmax   1.1  BLOG文档结构图     ...","commentCount":0,"href":"https://my.oschina.net/lhrbest/blog/1573899","id":1573899,"original":true,"pubDate":"2017-11-15 14:15:45","recommend":true,"title":"ipcs、ipcrm、sysresv、kernel.shmmax","type":3,"viewCount":19},{"author":"chai2010","body":"作为一个严肃的码农，用ASCII画图是一门艺术。 MonoDraw - ASCII 画图界...","commentCount":0,"href":"https://my.oschina.net/chai2010/blog/1573893","id":1573893,"original":true,"pubDate":"2017-11-15 13:59:51","recommend":true,"title":"用ASCII画图","type":3,"viewCount":210}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":1000}
     * time : 2017-11-16 09:40:35
     */

    private int code;
    private String message;
    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public List getItemDatas() {
        return result.items;
    }

    public static class ResultBean {
        /**
         * items : [{"author":"ios122","body":"背景介绍 我有一个习惯，定闹钟每隔60分钟左右，提醒自己休息一次。我发...","commentCount":2,"href":"https://my.oschina.net/ios122/blog/1574239","id":1574239,"original":true,"pubDate":"2017-11-16 00:54:20","recommend":true,"title":"【树莓派自动化应用实例】整点提醒自己休息五分钟","type":3,"viewCount":76},{"author":"老司机带你撸代码","body":"前言 \u2003\u2003笔者学习一门知识有一个习惯，就是会先去了解这门知识的一个大...","commentCount":0,"href":"https://my.oschina.net/lsjcoder/blog/1574229","id":1574229,"original":true,"pubDate":"2017-11-15 23:56:48","recommend":true,"title":"前端编年史","type":3,"viewCount":44},{"author":"温安适","body":"1.为什么选择zookeepr+leveldb,构建activemq主从集群 官网关于主从集群的...","commentCount":7,"href":"https://my.oschina.net/floor/blog/1574213","id":1574213,"original":true,"pubDate":"2017-11-15 23:11:54","recommend":true,"title":"基于zookeeper+leveldb的activemq集群","type":3,"viewCount":60},{"author":"WaltonWang","body":"Author: xidianwangtao@gmail.com 注意事项 截止Kubernetes 1.8版本： ...","commentCount":3,"href":"https://my.oschina.net/jxcdwangtao/blog/1574199","id":1574199,"original":true,"pubDate":"2017-11-15 22:25:01","recommend":true,"title":"如何在Kubernetes集群中利用GPU进行AI训练","type":3,"viewCount":72},{"author":"quanke_","body":"本节介绍以下 CRUD API： 单文档 APIs Index API Get API Delete API De...","commentCount":0,"href":"https://my.oschina.net/quanke/blog/1574188","id":1574188,"original":true,"pubDate":"2017-11-15 21:44:36","recommend":true,"title":"Elasticsearch Java API 索引的增删改查（二）","type":3,"viewCount":41},{"author":"Ann子尘","body":"上节我们使用node.js搭建了属于自己的第一个后端服务，但是只能将当前发...","commentCount":0,"href":"https://my.oschina.net/babyanzichen/blog/1574155","id":1574155,"original":true,"pubDate":"2017-11-15 19:53:03","recommend":true,"title":"一步一步教您用websocket+nodeJS搭建简易聊天室(3)","type":3,"viewCount":45},{"author":"woshiwufeng","body":"网站开发开发大致分为前端和后端，前端主要负责实现视觉和交互效果，以及...","commentCount":0,"href":"https://my.oschina.net/u/3728169/blog/1574142","id":1574142,"original":true,"pubDate":"2017-11-15 19:13:04","recommend":true,"title":"零基础的前端开发初学者应如何系统地学习？","type":3,"viewCount":29},{"author":"Java团长","body":"引言 Java泛型是jdk1.5中引入的一个新特性，泛型提供了编译时的类型检测...","commentCount":0,"href":"https://my.oschina.net/u/3721254/blog/1574131","id":1574131,"original":true,"pubDate":"2017-11-15 18:43:41","recommend":true,"title":"Java泛型详解","type":3,"viewCount":109},{"author":"听风的小猪","body":"一、虚拟主机 RabbitMQ服务器可以创建虚拟主机，它能拥有自己的队列、绑...","commentCount":0,"href":"https://my.oschina.net/zhangyangyang/blog/1574126","id":1574126,"original":true,"pubDate":"2017-11-15 18:27:56","recommend":true,"title":"RabbitMQ系列二：管理RabbitMQ","type":3,"viewCount":99},{"author":"GermanWifi","body":"实验案例由 Luca Sinico (InfoCamere 软件开发人员) 负责编写  实验概述...","commentCount":0,"href":"https://my.oschina.net/u/3491128/blog/1574125","id":1574125,"original":true,"pubDate":"2017-11-15 18:24:00","recommend":true,"title":"图数据库与关系数据库的实验对比\u2014\u2014意大利商会 InfoCamere 案例","type":3,"viewCount":37},{"author":"Java团长","body":"本文着重介绍了 Java 异常选择和使用中的一些误区，希望各位读者能够熟练...","commentCount":0,"href":"https://my.oschina.net/u/3721254/blog/1574091","id":1574091,"original":true,"pubDate":"2017-11-15 17:24:57","recommend":true,"title":"Java异常处理的误区和经验总结","type":3,"viewCount":90},{"author":"听风的小猪","body":"一、基本介绍 RabbitMQ是一个实现了AMQP协议（是一个异步消息传递所使用...","commentCount":2,"href":"https://my.oschina.net/zhangyangyang/blog/1574086","id":1574086,"original":true,"pubDate":"2017-11-15 17:20:39","recommend":true,"title":"RabbitMQ系列一：初识RabbitMQ","type":3,"viewCount":157},{"author":"Mr_Qi","body":"背景 提到SpringBoot各位开发者大概能想到一些标签 \u201c新\u201d \u201c快\u201d \u201cFat...","commentCount":0,"href":"https://my.oschina.net/qixiaobo025/blog/1574084","id":1574084,"original":true,"pubDate":"2017-11-15 17:20:33","recommend":true,"title":"SpringBoot之自动配置","type":3,"viewCount":117},{"author":"woshiwufeng","body":"哎哎 1、鼠标移进网页里，不见了= = *{\n    cursor: none!important;\n}\n...","commentCount":0,"href":"https://my.oschina.net/u/3728169/blog/1574078","id":1574078,"original":true,"pubDate":"2017-11-15 17:17:11","recommend":true,"title":"新手玩CSS中的一些黑科技","type":3,"viewCount":85},{"author":"EACDY","body":"本文搭建一个三节点的Kafka集群。该集群有三个Zookeeper、三个Kafka Bro...","commentCount":0,"href":"https://my.oschina.net/eacdy/blog/1574016","id":1574016,"original":true,"pubDate":"2017-11-15 16:13:24","recommend":true,"title":"kafka_2.11-0.11.0.1集群搭建","type":3,"viewCount":77},{"author":"阿浩yohann","body":"##Vue之父子兄弟组件间通信 @(JavaScript)[学习笔记] [TOC] 导言 最近在...","commentCount":0,"href":"https://my.oschina.net/u/3328758/blog/1573927","id":1573927,"original":true,"pubDate":"2017-11-15 14:48:45","recommend":true,"title":"Vue之父子兄弟组件间通信","type":3,"viewCount":51},{"author":"Mr_Qi","body":"背景 目前多配置来说基本也是开发最常见的场景之一。 以F6来说目前我们存...","commentCount":0,"href":"https://my.oschina.net/qixiaobo025/blog/1573908","id":1573908,"original":true,"pubDate":"2017-11-15 14:25:31","recommend":true,"title":"maven profile VS spring profile","type":3,"viewCount":47},{"author":"巨杉数据库","body":"  近年来，全球金融科技每年的投入已经超过500亿美元，中国的金融科技发...","commentCount":0,"href":"https://my.oschina.net/wangzhonnew/blog/1573905","id":1573905,"original":true,"pubDate":"2017-11-15 14:23:28","recommend":true,"title":"金融级数据库的未来发展方向","type":3,"viewCount":111},{"author":"小麦苗","body":"ipcs、ipcrm、sysresv、kernel.shmmax   1.1  BLOG文档结构图     ...","commentCount":0,"href":"https://my.oschina.net/lhrbest/blog/1573899","id":1573899,"original":true,"pubDate":"2017-11-15 14:15:45","recommend":true,"title":"ipcs、ipcrm、sysresv、kernel.shmmax","type":3,"viewCount":19},{"author":"chai2010","body":"作为一个严肃的码农，用ASCII画图是一门艺术。 MonoDraw - ASCII 画图界...","commentCount":0,"href":"https://my.oschina.net/chai2010/blog/1573893","id":1573893,"original":true,"pubDate":"2017-11-15 13:59:51","recommend":true,"title":"用ASCII画图","type":3,"viewCount":210}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 1000
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * author : ios122
             * body : 背景介绍 我有一个习惯，定闹钟每隔60分钟左右，提醒自己休息一次。我发...
             * commentCount : 2
             * href : https://my.oschina.net/ios122/blog/1574239
             * id : 1574239
             * original : true
             * pubDate : 2017-11-16 00:54:20
             * recommend : true
             * title : 【树莓派自动化应用实例】整点提醒自己休息五分钟
             * type : 3
             * viewCount : 76
             */

            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private boolean original;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isOriginal() {
                return original;
            }

            public void setOriginal(boolean original) {
                this.original = original;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
