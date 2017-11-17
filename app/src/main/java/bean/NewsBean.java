package bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class NewsBean extends BasePageBean<NewsBean.ResultBean.ItemsBean>{
    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"周其","body":"谷歌浏览器Chrome Stable稳定版迎来v62正式版首版发布，详细版本号为v62.0.3202.89，上一个正式版v62.0.3202.75发布于10月27日，时隔11天Google又发...","commentCount":2,"href":"https://www.oschina.net/news/90384/google-chrome-62-0-3202-89","id":90384,"pubDate":"2017-11-08 11:32:25","recommend":true,"title":"Google Chrome 62.0.3202.89 正式版发布","type":6,"viewCount":0},{"author":"coco1225","body":"PHP 异步协程框架 Group-Co 1.0.5 已发布，更新如下: 支持 MySQL 注册中心 服务支持自定义用户进程 新增心跳监控进程类 文档整理优化 文档地址：h...","commentCount":1,"href":"https://www.oschina.net/news/90383/group-go-1-0-5","id":90383,"pubDate":"2017-11-08 10:21:06","recommend":true,"title":"PHP异步协程框架Group-Co 1.0.5支持MySQL注册中心","type":6,"viewCount":77},{"author":"xingchen","body":"更新内容： 1、禁止上传的文件名后缀为php 2、禁止空目录名的生成 3、禁止删除非空的父目录 4、其他安全更新 更新步骤请参考部署手册：https://www...","commentCount":4,"href":"https://www.oschina.net/news/90382/showdoc-1-8-4","id":90382,"pubDate":"2017-11-08 10:05:47","recommend":true,"title":"ShowDoc v1.8.4 发布，IT 团队的在线 API 文档工具","type":6,"viewCount":321},{"author":"优客服多渠道客服系统","body":"UCKeFu v3.6.0 已发布，UCKeFu 基于 Java 语言开发，是一个全渠道融合的客户支持服务平台，聚合企业内部多个客服渠道，帮助各种行业各种规模的企业...","commentCount":0,"href":"https://www.oschina.net/news/90381/uckefu-3-6-0","id":90381,"pubDate":"2017-11-08 09:45:18","recommend":true,"title":"UCKeFu 3.6.0 升级 Spring Boot 和 ElasticSearch 版本","type":6,"viewCount":208},{"author":"炒蚕豆吃蹦豆","body":"禅道开源版9.6版本正式发布。 新版本中，新增了webhook功能，实现与倍冾、钉钉的消息通知接口；新增禅道操作获取积分的功能； 项目任务新增了多人任...","commentCount":1,"href":"https://www.oschina.net/news/90380/zentao-9-6","id":90380,"pubDate":"2017-11-08 09:26:06","recommend":true,"title":"禅道 9.6 版本发布，新增 webhook、积分和多人任务","type":6,"viewCount":244},{"author":"ruki","body":"xmake-idea 插件深度集成了xmake和Intellij-IDEA，提供方便快速的跨平台c/c++构建。 并且它也支持其他基于Intellij的IDE环境, 例如：Clion, Andr...","commentCount":5,"href":"https://www.oschina.net/news/90379/xmake-idea-1-0-3","id":90379,"pubDate":"2017-11-08 08:56:32","recommend":false,"title":"xmake-idea v1.0.3，集成 xmake 的 Intellij-IDEA 插件","type":6,"viewCount":372},{"author":"oschina","body":"\u201c自由，开放，分享\u201d的西安源创会遇上 \u201c数字丝路 码动未来\u201d，不止干货满满，还十足有趣。你，忍心错过吗？","commentCount":33,"href":"https://www.oschina.net/event/2267764","id":2267764,"pubDate":"2017-11-08 08:41:12","recommend":false,"title":"报名参加 11 月西安源创会 遇见万人程序员嘉年华活动","type":5,"viewCount":92},{"author":"局长","body":"版本号跳跃如此大，相信 MySQL 已然来到了一个崭新的台阶。那么 MySQL 8.0 有哪些值得关注的新特性呢？欢迎大家进入高手问答一起探讨！...","commentCount":8,"href":"https://www.oschina.net/question/2720166_2269321","id":2269321,"pubDate":"2017-11-08 08:30:44","recommend":false,"title":"高手问答 | MySQL 8.0 有哪些值得关注的新特性？","type":2,"viewCount":1630},{"author":"局长","body":"asciilize 是用 Go 语言编写的将图片转换成 ASCII 字符的工具。","commentCount":0,"href":"https://gitee.com/wangfuying/asciilize","id":90376,"pubDate":"2017-11-08 08:28:28","recommend":false,"title":"码云推荐 | Go 实现的将图片转换成 ASCII 字符 asciilize","type":0,"viewCount":6},{"author":"局长","body":"Pyro 基于 Python 与 PyTorch 之上，专注于变分推理，同时支持可组合推理算法。Pyro 能够实现灵活而富有表现力的深度概率建模，将现代深度学习和贝...","commentCount":1,"href":"https://www.oschina.net/p/uber-pyro","id":46285,"pubDate":"2017-11-08 08:26:43","recommend":false,"title":"Uber 开源基于 PyTorch 的深度概率编程语言 \u2014 Pyro","type":1,"viewCount":607},{"author":"局长","body":"如果要选出最流行的操作系统，我们也许会下意识地想到 Linux、Windows、macOS、iOS 和 Android 等一些当下主流的操作系统。但事实恐怕不是我们以为...","commentCount":28,"href":"https://www.oschina.net/news/90374/minix-the-most-popular-os-in-the-world","id":90374,"pubDate":"2017-11-08 08:19:48","recommend":false,"title":"世界上最流行的操作系统 MINIX 暗藏着最大的威胁？","type":6,"viewCount":2590},{"author":"局长","body":"Tomcat 的 NIO 是基于 I/O 复用来实现的。对这点一定要清楚，不然我们的讨论就不在一个逻辑线上。","commentCount":20,"href":"https://my.oschina.net/wangxindong/blog/1562957","id":1562957,"pubDate":"2017-11-08 08:19:34","recommend":false,"title":"每日一博 | 干货满满 深度解读 Tomcat 中的 NIO 模型","type":3,"viewCount":1365},{"author":"局长","body":"GitHub 最近联手 Facebook 推出了 Atom-IDE，为其 Atom 编辑器带来了下面这些更深度的开发功能： 自动完成 大纲视图 查找引用 定义跳转 悬浮提示 ...","commentCount":18,"href":"https://www.oschina.net/news/90372/atom-ide-vs-vscode-comparison","id":90372,"pubDate":"2017-11-08 08:16:44","recommend":false,"title":"Visual Studio Code v.s Atom-IDE：Web 开发哪家强？","type":6,"viewCount":2122},{"author":"局长","body":"据《纽约时报》近日报道，谷歌等科技巨头正在探索，用自动化方法来解决人工智能专家短缺的问题。 让人工智能机器去制造其他人工智能机器，这是研究...","commentCount":9,"href":"https://www.oschina.net/news/90371/machine-learning-artificial-intelligence-ai","id":90371,"pubDate":"2017-11-08 08:15:28","recommend":false,"title":"谷歌等科技巨头研究新技术：让人工智能自我进化","type":6,"viewCount":779},{"author":"局长","body":"养狗的小伙伴，记得多抽点时间陪陪他们，他们也很需要陪伴。","commentCount":36,"href":"https://my.oschina.net/xxiaobian/blog/1568015","id":1568015,"pubDate":"2017-11-08 08:10:13","recommend":false,"title":"OSChina 周三乱弹 \u2014\u2014 小猪佩妮，哈哈哈","type":3,"viewCount":2308},{"author":"局长","body":"网络安全公司 We Are Segment 研究人员 Filippo Cavallarin 近期在 FireFox 浏览器中发现一处关键漏洞 \u2014\u2014 TorMoil，能够导致用户真实 IP 地址在线...","commentCount":3,"href":"https://www.oschina.net/news/90369/tor-on-linuxmac-may-leak-ip-update-available","id":90369,"pubDate":"2017-11-08 08:07:22","recommend":false,"title":"Tor 浏览器存在严重漏洞 或泄露用户真实 IP 地址","type":6,"viewCount":1054},{"author":"周其","body":"WordPress 4.9的第二个候选版本现已发布。 发布候选版（RC）意味着准备工作已经完成了， WordPress 4.9 有望在11月14号发布。 自上周发布RC 1以来，...","commentCount":2,"href":"https://www.oschina.net/news/90368/wordpress-4-9-release-candidate-2","id":90368,"pubDate":"2017-11-08 07:57:02","recommend":false,"title":"WordPress 4.9 候选版2 发布，11 月 14 日发布正式版","type":6,"viewCount":404},{"author":"周其","body":"Teiid 9.2.7 发布了.  此版本解决了6个问题: [TEIID-4870] - Google translator unexpected behavior for view update without trigger [TEIID-5...","commentCount":0,"href":"https://www.oschina.net/news/90367/teiid-9-2-7","id":90367,"pubDate":"2017-11-08 07:47:50","recommend":false,"title":"Teiid 9.2.7 发布，数据虚拟化系统","type":6,"viewCount":246},{"author":"周其","body":"Errai 4.0.1.Final 终于发布了，这是从4.0.x系列分支开始的第一个版本。。Errai 是 JBoss 开发的一个基于 GWT 的框架，使用下一代 WEB 技术，用于构...","commentCount":3,"href":"https://www.oschina.net/news/90366/errai-4-0-1-final-released","id":90366,"pubDate":"2017-11-08 07:44:15","recommend":false,"title":"Errai 4.0.1.Final 发布，异步消息传递框架","type":6,"viewCount":353},{"author":"周其","body":"gRPC 1.7.2 已发布，gRPC 是一个高性能、开源、通用的 RPC 框架，面向移动和 HTTP/2 设计，是由谷歌发布的首款基于 Protocol Buffers 的 RPC 框架...","commentCount":2,"href":"https://www.oschina.net/news/90365/grpc-1-7-2","id":90365,"pubDate":"2017-11-08 07:38:37","recommend":false,"title":"gRPC 1.7.2 发布，Google 高性能 RPC 框架","type":6,"viewCount":857}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":83047}
     * time : 2017-11-08 11:57:33
     */

    private int code;
    private String message;
    public ResultBean result;
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
         * items : [{"author":"周其","body":"谷歌浏览器Chrome Stable稳定版迎来v62正式版首版发布，详细版本号为v62.0.3202.89，上一个正式版v62.0.3202.75发布于10月27日，时隔11天Google又发...","commentCount":2,"href":"https://www.oschina.net/news/90384/google-chrome-62-0-3202-89","id":90384,"pubDate":"2017-11-08 11:32:25","recommend":true,"title":"Google Chrome 62.0.3202.89 正式版发布","type":6,"viewCount":0},{"author":"coco1225","body":"PHP 异步协程框架 Group-Co 1.0.5 已发布，更新如下: 支持 MySQL 注册中心 服务支持自定义用户进程 新增心跳监控进程类 文档整理优化 文档地址：h...","commentCount":1,"href":"https://www.oschina.net/news/90383/group-go-1-0-5","id":90383,"pubDate":"2017-11-08 10:21:06","recommend":true,"title":"PHP异步协程框架Group-Co 1.0.5支持MySQL注册中心","type":6,"viewCount":77},{"author":"xingchen","body":"更新内容： 1、禁止上传的文件名后缀为php 2、禁止空目录名的生成 3、禁止删除非空的父目录 4、其他安全更新 更新步骤请参考部署手册：https://www...","commentCount":4,"href":"https://www.oschina.net/news/90382/showdoc-1-8-4","id":90382,"pubDate":"2017-11-08 10:05:47","recommend":true,"title":"ShowDoc v1.8.4 发布，IT 团队的在线 API 文档工具","type":6,"viewCount":321},{"author":"优客服多渠道客服系统","body":"UCKeFu v3.6.0 已发布，UCKeFu 基于 Java 语言开发，是一个全渠道融合的客户支持服务平台，聚合企业内部多个客服渠道，帮助各种行业各种规模的企业...","commentCount":0,"href":"https://www.oschina.net/news/90381/uckefu-3-6-0","id":90381,"pubDate":"2017-11-08 09:45:18","recommend":true,"title":"UCKeFu 3.6.0 升级 Spring Boot 和 ElasticSearch 版本","type":6,"viewCount":208},{"author":"炒蚕豆吃蹦豆","body":"禅道开源版9.6版本正式发布。 新版本中，新增了webhook功能，实现与倍冾、钉钉的消息通知接口；新增禅道操作获取积分的功能； 项目任务新增了多人任...","commentCount":1,"href":"https://www.oschina.net/news/90380/zentao-9-6","id":90380,"pubDate":"2017-11-08 09:26:06","recommend":true,"title":"禅道 9.6 版本发布，新增 webhook、积分和多人任务","type":6,"viewCount":244},{"author":"ruki","body":"xmake-idea 插件深度集成了xmake和Intellij-IDEA，提供方便快速的跨平台c/c++构建。 并且它也支持其他基于Intellij的IDE环境, 例如：Clion, Andr...","commentCount":5,"href":"https://www.oschina.net/news/90379/xmake-idea-1-0-3","id":90379,"pubDate":"2017-11-08 08:56:32","recommend":false,"title":"xmake-idea v1.0.3，集成 xmake 的 Intellij-IDEA 插件","type":6,"viewCount":372},{"author":"oschina","body":"\u201c自由，开放，分享\u201d的西安源创会遇上 \u201c数字丝路 码动未来\u201d，不止干货满满，还十足有趣。你，忍心错过吗？","commentCount":33,"href":"https://www.oschina.net/event/2267764","id":2267764,"pubDate":"2017-11-08 08:41:12","recommend":false,"title":"报名参加 11 月西安源创会 遇见万人程序员嘉年华活动","type":5,"viewCount":92},{"author":"局长","body":"版本号跳跃如此大，相信 MySQL 已然来到了一个崭新的台阶。那么 MySQL 8.0 有哪些值得关注的新特性呢？欢迎大家进入高手问答一起探讨！...","commentCount":8,"href":"https://www.oschina.net/question/2720166_2269321","id":2269321,"pubDate":"2017-11-08 08:30:44","recommend":false,"title":"高手问答 | MySQL 8.0 有哪些值得关注的新特性？","type":2,"viewCount":1630},{"author":"局长","body":"asciilize 是用 Go 语言编写的将图片转换成 ASCII 字符的工具。","commentCount":0,"href":"https://gitee.com/wangfuying/asciilize","id":90376,"pubDate":"2017-11-08 08:28:28","recommend":false,"title":"码云推荐 | Go 实现的将图片转换成 ASCII 字符 asciilize","type":0,"viewCount":6},{"author":"局长","body":"Pyro 基于 Python 与 PyTorch 之上，专注于变分推理，同时支持可组合推理算法。Pyro 能够实现灵活而富有表现力的深度概率建模，将现代深度学习和贝...","commentCount":1,"href":"https://www.oschina.net/p/uber-pyro","id":46285,"pubDate":"2017-11-08 08:26:43","recommend":false,"title":"Uber 开源基于 PyTorch 的深度概率编程语言 \u2014 Pyro","type":1,"viewCount":607},{"author":"局长","body":"如果要选出最流行的操作系统，我们也许会下意识地想到 Linux、Windows、macOS、iOS 和 Android 等一些当下主流的操作系统。但事实恐怕不是我们以为...","commentCount":28,"href":"https://www.oschina.net/news/90374/minix-the-most-popular-os-in-the-world","id":90374,"pubDate":"2017-11-08 08:19:48","recommend":false,"title":"世界上最流行的操作系统 MINIX 暗藏着最大的威胁？","type":6,"viewCount":2590},{"author":"局长","body":"Tomcat 的 NIO 是基于 I/O 复用来实现的。对这点一定要清楚，不然我们的讨论就不在一个逻辑线上。","commentCount":20,"href":"https://my.oschina.net/wangxindong/blog/1562957","id":1562957,"pubDate":"2017-11-08 08:19:34","recommend":false,"title":"每日一博 | 干货满满 深度解读 Tomcat 中的 NIO 模型","type":3,"viewCount":1365},{"author":"局长","body":"GitHub 最近联手 Facebook 推出了 Atom-IDE，为其 Atom 编辑器带来了下面这些更深度的开发功能： 自动完成 大纲视图 查找引用 定义跳转 悬浮提示 ...","commentCount":18,"href":"https://www.oschina.net/news/90372/atom-ide-vs-vscode-comparison","id":90372,"pubDate":"2017-11-08 08:16:44","recommend":false,"title":"Visual Studio Code v.s Atom-IDE：Web 开发哪家强？","type":6,"viewCount":2122},{"author":"局长","body":"据《纽约时报》近日报道，谷歌等科技巨头正在探索，用自动化方法来解决人工智能专家短缺的问题。 让人工智能机器去制造其他人工智能机器，这是研究...","commentCount":9,"href":"https://www.oschina.net/news/90371/machine-learning-artificial-intelligence-ai","id":90371,"pubDate":"2017-11-08 08:15:28","recommend":false,"title":"谷歌等科技巨头研究新技术：让人工智能自我进化","type":6,"viewCount":779},{"author":"局长","body":"养狗的小伙伴，记得多抽点时间陪陪他们，他们也很需要陪伴。","commentCount":36,"href":"https://my.oschina.net/xxiaobian/blog/1568015","id":1568015,"pubDate":"2017-11-08 08:10:13","recommend":false,"title":"OSChina 周三乱弹 \u2014\u2014 小猪佩妮，哈哈哈","type":3,"viewCount":2308},{"author":"局长","body":"网络安全公司 We Are Segment 研究人员 Filippo Cavallarin 近期在 FireFox 浏览器中发现一处关键漏洞 \u2014\u2014 TorMoil，能够导致用户真实 IP 地址在线...","commentCount":3,"href":"https://www.oschina.net/news/90369/tor-on-linuxmac-may-leak-ip-update-available","id":90369,"pubDate":"2017-11-08 08:07:22","recommend":false,"title":"Tor 浏览器存在严重漏洞 或泄露用户真实 IP 地址","type":6,"viewCount":1054},{"author":"周其","body":"WordPress 4.9的第二个候选版本现已发布。 发布候选版（RC）意味着准备工作已经完成了， WordPress 4.9 有望在11月14号发布。 自上周发布RC 1以来，...","commentCount":2,"href":"https://www.oschina.net/news/90368/wordpress-4-9-release-candidate-2","id":90368,"pubDate":"2017-11-08 07:57:02","recommend":false,"title":"WordPress 4.9 候选版2 发布，11 月 14 日发布正式版","type":6,"viewCount":404},{"author":"周其","body":"Teiid 9.2.7 发布了.  此版本解决了6个问题: [TEIID-4870] - Google translator unexpected behavior for view update without trigger [TEIID-5...","commentCount":0,"href":"https://www.oschina.net/news/90367/teiid-9-2-7","id":90367,"pubDate":"2017-11-08 07:47:50","recommend":false,"title":"Teiid 9.2.7 发布，数据虚拟化系统","type":6,"viewCount":246},{"author":"周其","body":"Errai 4.0.1.Final 终于发布了，这是从4.0.x系列分支开始的第一个版本。。Errai 是 JBoss 开发的一个基于 GWT 的框架，使用下一代 WEB 技术，用于构...","commentCount":3,"href":"https://www.oschina.net/news/90366/errai-4-0-1-final-released","id":90366,"pubDate":"2017-11-08 07:44:15","recommend":false,"title":"Errai 4.0.1.Final 发布，异步消息传递框架","type":6,"viewCount":353},{"author":"周其","body":"gRPC 1.7.2 已发布，gRPC 是一个高性能、开源、通用的 RPC 框架，面向移动和 HTTP/2 设计，是由谷歌发布的首款基于 Protocol Buffers 的 RPC 框架...","commentCount":2,"href":"https://www.oschina.net/news/90365/grpc-1-7-2","id":90365,"pubDate":"2017-11-08 07:38:37","recommend":false,"title":"gRPC 1.7.2 发布，Google 高性能 RPC 框架","type":6,"viewCount":857}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 83047
         */

        public String nextPageToken;
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
             * author : 周其
             * body : 谷歌浏览器Chrome Stable稳定版迎来v62正式版首版发布，详细版本号为v62.0.3202.89，上一个正式版v62.0.3202.75发布于10月27日，时隔11天Google又发...
             * commentCount : 2
             * href : https://www.oschina.net/news/90384/google-chrome-62-0-3202-89
             * id : 90384
             * pubDate : 2017-11-08 11:32:25
             * recommend : true
             * title : Google Chrome 62.0.3202.89 正式版发布
             * type : 6
             * viewCount : 0
             */

            public String author;
            public String body;
            public int commentCount;
            public String href;
            public int id;
            public String pubDate;
            public boolean recommend;
            public String title;
            public int type;
            public int viewCount;

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
