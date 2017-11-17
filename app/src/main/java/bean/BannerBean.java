package bean;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8 0008.
 */

public class BannerBean extends BasePageBean<BannerBean.ResultBean.ItemsBean> {
    /**
     * code : 1
     * message : success
     * result : {"items":[{"detail":"","href":"http://t.cn/Rl6jZZS","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_e836d61d-6adb-4c03-a32f-055eef1712a9.jpg","name":"这个前端程序媛＂对象＂有点多","pubDate":"2017-11-06 07:44:43","type":0},{"detail":"","href":"https://www.oschina.net/event/2267764","id":2267764,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_20700c96-8021-4ac0-9417-dbd83796a641.jpg","name":"源创会 | 西安站开始报名啦！","pubDate":"2017-10-23 20:14:00","type":5},{"detail":"","href":"https://www.oschina.net/question/2896879_2268389","id":2268389,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_72646770-c5f6-4620-8ec1-6e735c97d4b5.jpg","name":"十年成长，Go 语言的演化之路","pubDate":"2017-10-25 18:20:27","type":2},{"detail":"","href":"https://www.oschina.net/question/2720166_2269321","id":2269321,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_c36408cf-ffd2-4e7e-9c51-aca874161927.jpg","name":"MySQL 8.0 有哪些值得关注的新特性？","pubDate":"2017-11-07 20:54:51","type":2},{"detail":"","href":"http://m.aiceforum.com/?from=osl","id":1555616,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_c167d87b-292a-44eb-87ef-5df8ef495a0a.jpg","name":"全球人工智能企业家论坛","pubDate":"2017-10-31 18:28:59","type":0}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2017-11-08 21:01:07
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
         * items : [{"detail":"","href":"http://t.cn/Rl6jZZS","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_e836d61d-6adb-4c03-a32f-055eef1712a9.jpg","name":"这个前端程序媛＂对象＂有点多","pubDate":"2017-11-06 07:44:43","type":0},{"detail":"","href":"https://www.oschina.net/event/2267764","id":2267764,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_20700c96-8021-4ac0-9417-dbd83796a641.jpg","name":"源创会 | 西安站开始报名啦！","pubDate":"2017-10-23 20:14:00","type":5},{"detail":"","href":"https://www.oschina.net/question/2896879_2268389","id":2268389,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_72646770-c5f6-4620-8ec1-6e735c97d4b5.jpg","name":"十年成长，Go 语言的演化之路","pubDate":"2017-10-25 18:20:27","type":2},{"detail":"","href":"https://www.oschina.net/question/2720166_2269321","id":2269321,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_c36408cf-ffd2-4e7e-9c51-aca874161927.jpg","name":"MySQL 8.0 有哪些值得关注的新特性？","pubDate":"2017-11-07 20:54:51","type":2},{"detail":"","href":"http://m.aiceforum.com/?from=osl","id":1555616,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_c167d87b-292a-44eb-87ef-5df8ef495a0a.jpg","name":"全球人工智能企业家论坛","pubDate":"2017-10-31 18:28:59","type":0}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
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
             * detail :
             * href : http://t.cn/Rl6jZZS
             * id : 0
             * img : https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_e836d61d-6adb-4c03-a32f-055eef1712a9.jpg
             * name : 这个前端程序媛＂对象＂有点多
             * pubDate : 2017-11-06 07:44:43
             * type : 0
             */

            public String detail;
            public String href;
            public int id;
            public String img;
            public String name;
            public String pubDate;
            public int type;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
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

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
