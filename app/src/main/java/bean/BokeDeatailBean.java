package bean;

import com.google.gson.annotations.SerializedName;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by Administrator on 2017/11/16 0016.
 */

public class BokeDeatailBean extends BasePageBean<BokeDeatailBean.ResultBean.AboutsBean>{

    /**
     * code : 1
     * message : success
     * result : {"abouts":[{"commentCount":0,"id":1571602,"title":"【LuaJIT版】从零开始在 macOS 上配置 Lua 开发环境","viewCount":177},{"commentCount":0,"id":1543146,"title":"LuaJIT的变量实现-TValue","viewCount":8},{"commentCount":10,"id":519598,"title":"Lua包管理工具Luarocks详解","viewCount":3827}],"abstract":"不过大部分手机闹钟都不支持这种以小时为单位的周期闹铃。所以，我以前每次都是都手动调整闹钟时间。总感觉有点 Low！于是，我就写了个简单的发邮件的 Lua 脚本，放到树莓派上作为一个shell命令使用;然后在每周一到周五的9点至23点整点各执行一次发邮件的操作。邮件是发到了我的 QQ 邮箱。收到QQ邮件后，左上角会有一个通知悬浮窗，体验比手机的震动声好了很多。","author":"ios122","authorId":2439023,"authorPortrait":"https://static.oschina.net/uploads/user/1219/2439023_50.jpeg?t=1500749731000","authorRelation":4,"body":"<h2>背景介绍<\/h2> \n<p><img src=\"http://www.oschina.net/action/blog/img_proxy?url=http%3A%2F%2Fupload-images.jianshu.io%2Fupload_images%2F1081577-b83dc0a1e35fdc94.png%3FimageMogr2%2Fauto-orient%2Fstrip%257CimageView2%2F2%2Fw%2F1240\" alt=\"show.png\"><\/p> \n<p>我有一个习惯，定闹钟每隔60分钟左右，提醒自己休息一次。我发现自己有时候长时间思考，很容易拘泥于细节之中。适当的简单休息过后，往往会对正在解决和处理的问题有新的认识和发现，有事半功倍的奇效。<\/p> \n<p>不过大部分手机闹钟都不支持这种以小时为单位的周期闹铃。所以，我以前每次都是都手动调整闹钟时间。总感觉有点 Low！于是，我就写了个简单的发邮件的 Lua 脚本，放到树莓派上作为一个shell命令使用;然后在每周一到周五的9点至23点整点各执行一次发邮件的操作。邮件是发到了我的 QQ 邮箱。收到QQ邮件后，左上角会有一个通知悬浮窗，体验比手机的震动声好了很多。<\/p> \n<p>另外，之所以会选择使用 Lua 语言，只是最近自己刚好在看 Lua 而已，用其他语言也是可以的。<\/p> \n<h2>在树莓派上配置必要的 Lua 环境<\/h2> \n<h3>安装 LuaJIT<\/h3> \n<p>树莓派的 debian 官方推荐定制系统，内置有 <em>Lua 5.1.5<\/em>.但是 LuaJIT 使用了 JIT 技术，执行效率更高，所以更推荐安装和使用。<em>LuaJIT<\/em> 对应的也是 <em>Lua 5.1<\/em> 的语法。<\/p> \n<p>你可以在 <a href=\"http://luajit.org/download.html\" rel=\"nofollow\">LuaJIT 下载页<\/a> 右键查看最新的 LuaJIT 稳定版本，然后参照执行：<\/p> \n<pre><code>wget http://luajit.org/download/LuaJIT-2.0.5.tar.gz\ntar xzf LuaJIT-2.0.5.tar.gz\ncd LuaJIT-2.0.5\nmake &amp;&amp; sudo make install\n<\/code><\/pre> \n<p>验证是否安装成功，请执行：<\/p> \n<pre><code>luajit -v\n<\/code><\/pre> \n<p>安装成功，会输出：<\/p> \n<pre><code>LuaJIT 2.0.5 -- Copyright (C) 2005-2017 Mike Pall. http://luajit.org/\n<\/code><\/pre> \n<h3>安装 luarocks<\/h3> \n<p>luarocks 是 Lua 的包管理工具。在树莓派上需要从源码安装 luarocks 。这需要一些技巧。<\/p> \n<p>你可以到 <a href=\"https://github.com/luarocks/luarocks/wiki/Download\" rel=\"nofollow\">luarocks下载页<\/a> 查看最新的luarocks版本，然后参考执行以下命令：<\/p> \n<pre><code>wget http://luarocks.github.io/luarocks/releases/luarocks-2.4.3.tar.gz\ntar xzf luarocks-2.4.3.tar.gz\ncd luarocks-2.4.3\n<\/code><\/pre> \n<p>luarocks 在编译前，需要先进行配置。完整的配置内容，参见：<a href=\"https://github.com/luarocks/luarocks/wiki/Installation-instructions-for-Unix#Customizing_your_settings\" rel=\"nofollow\">Customizing your settings<\/a>。基于 LuaJIT 的配置命令如下：<\/p> \n<pre><code>./configure --lua-suffix=\"jit\"\n<\/code><\/pre> \n<p>然后编译安装：<\/p> \n<pre><code>make build\nsudo make install\n<\/code><\/pre> \n<p>验证是否安装成功：<\/p> \n<pre><code>luarocks\n<\/code><\/pre> \n<h3>安装 luasocket<\/h3> \n<p>luasocket 这个库，下面的代码会用到，需要提前安装下。 如果 luarocks 安装成功，那其他的 lua 库安装就非常简单了：<\/p> \n<pre><code>sudo luarocks install luasocket\n<\/code><\/pre> \n<h2>简单的 Lua 脚本： 发送邮件提示自己注意休息<\/h2> \n<p>新建一个 rest_reminder.lua 文件<\/p> \n<pre><code>vi rest_reminder.lua\n<\/code><\/pre> \n<p>然后输入以下 Lua 代码：<\/p> \n<pre><code>#!/usr/bin/env luajit\nlocal smtp = require(\"socket.smtp\")\nfrom = \"username@exapmle.com\" --发件人\n--收件人列表\nrcpt = {\n    \"your_qq_number@qq.com\"\n}\nmesgt = {\n    headers = { -- 只是文字显示内容.\n        to = \"your_qq_number@qq.com\", --收件人\n        subject = \"请休息五分钟!\" --主题\n    },\n    body = \"您已连续思考一小时,请先休息五分钟吧!\"\n}\nr, e = smtp.send{\n    from = from,\n    rcpt = rcpt,\n    source = smtp.message(mesgt),\n    server = \"smtp.example.com\",\n    user = \"username@exapmle.com\",\n    password = \"username_pwd\"\n}\nif not r then\n    print(e)\nelse\n    print(\"发送成功!\")\nend\n<\/code><\/pre> \n<p>如果你想实现一些更复杂的操作，最好在常用电脑上<a href=\"http://www.cnblogs.com/ios122/p/7819242.html\" rel=\"nofollow\">配置一个 Lua 完整的开发环境<\/a>。<\/p> \n<p>想要文件能执行当做命令执行，还需要给文件添加可执行权限：<\/p> \n<pre><code>chmod +x ./rest_reminder.lua\n<\/code><\/pre> \n<p>测试代码是否有效：<\/p> \n<pre><code>./rest_reminder.lua\n<\/code><\/pre> \n<p>正常执行的话，你的收件人邮箱（或邮件垃圾箱），应该会收到一封邮箱。<\/p> \n<p><img src=\"http://www.oschina.net/action/blog/img_proxy?url=http%3A%2F%2Fupload-images.jianshu.io%2Fupload_images%2F1081577-ee57bc4e0dcf35bd.png%3FimageMogr2%2Fauto-orient%2Fstrip%257CimageView2%2F2%2Fw%2F1240\" alt=\"test.png\"><\/p> \n<p>注意：<\/p> \n<ul> \n <li><strong>headers<\/strong> 中的收件人会显示在邮件头，但是真正决定发送给谁的是 <strong>rcpt<\/strong><\/li> \n <li><strong>smtp.example.com<\/strong> 要改为发信邮箱的 smtp 服务器。<\/li> \n <li><strong><a href=\"mailto:username@exapmle.com\" rel=\"nofollow\">username@exapmle.com<\/a><\/strong> 和 <strong>username_pwd<\/strong> 要改为真实的邮件用户名和密码<\/li> \n <li>部分邮箱的 smtp 功能，可能需要单独开通。<\/li> \n<\/ul> \n<h2>使用 crontab 来定时执行<\/h2> \n<p>crontab 简单实用，如果不是很熟悉，可以把它简单当做一个高度自定义的定时器。<\/p> \n<p>假设脚本的完整路径是 <strong>/home/pi/task/rest_reminder.lua<\/strong> 。<\/p> \n<p>执行：<\/p> \n<pre><code>crontab -e\n<\/code><\/pre> \n<p>在打开的内容区末尾新增：<\/p> \n<pre><code>00  9-23  *  *  *  /home/pi/task/rest_reminder.lua\n<\/code><\/pre> \n<p>保存退出，正常应该会看到提示：<\/p> \n<pre><code>crontab: installing new crontab\n<\/code><\/pre> \n<p>此时，我们的定时脚本已经生效了。即使重启电脑，这个脚本依然可以正常定时执行。<\/p> \n<p>crontab 借助于 cron 服务。在必要时，你可以使用 sytemed 的命令来操作 cron 服务：<\/p> \n<pre><code># 查看状态\nsudo systemctl status cron\n# 激活服务\nsudo systemctl enable cron\n<\/code><\/pre> \n<h2>参考文档<\/h2> \n<ul> \n <li><a href=\"http://www.cnblogs.com/ios122/p/7819242.html\" rel=\"nofollow\">【LuaJIT版】从零开始在 macOS 上配置 Lua 开发环境<\/a><\/li> \n <li><a href=\"https://github.com/luarocks/luarocks/wiki/Installation-instructions-for-Unix\" rel=\"nofollow\">Installation instructions for Unix<\/a><\/li> \n <li><a href=\"http://curran.blog.51cto.com/2788306/1391816\" rel=\"nofollow\">Lua smtp<\/a><\/li> \n <li><a href=\"https://segmentfault.com/a/1190000002628040\" rel=\"nofollow\">Linux 下执行定时任务 crontab 命令详解<\/a><\/li> \n <li><a href=\"http://linuxtools-rst.readthedocs.io/zh_CN/latest/tool/crontab.html#id10\" rel=\"nofollow\">crontab 使用实例<\/a><\/li> \n <li><a href=\"http://www.jianshu.com/p/ff2f0a2b481c\" rel=\"nofollow\">强大的crontab<\/a><\/li> \n<\/ul>","catalog":"颜风的歌","commentCount":2,"comments":[{"appClient":0,"author":"蓝水晶飞机","authorId":1269352,"authorPortrait":"https://static.oschina.net/uploads/user/634/1269352_50.jpg?t=1484488391000","content":"哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。","id":302158636,"pubDate":"2017-11-16 08:46:20"},{"appClient":0,"author":"ios122","authorId":2439023,"authorPortrait":"https://static.oschina.net/uploads/user/1219/2439023_50.jpeg?t=1500749731000","content":"用自己喜欢的姿势:smile:","id":302159123,"pubDate":"2017-11-16 09:26:55","refer":{"author":"蓝水晶飞机","content":"哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。"}}],"favorite":false,"href":"https://my.oschina.net/ios122/blog/1574239","id":1574239,"original":true,"payNotify":"https://my.oschina.net/action/blog/paySuccess","pubDate":"2017-11-16 00:54:20","recommend":true,"title":"【树莓派自动化应用实例】整点提醒自己休息五分钟","type":1,"viewCount":164}
     * time : 2017-11-16 11:49:52
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
        return result.abouts ;
    }

    public static class ResultBean {
        /**
         * abouts : [{"commentCount":0,"id":1571602,"title":"【LuaJIT版】从零开始在 macOS 上配置 Lua 开发环境","viewCount":177},{"commentCount":0,"id":1543146,"title":"LuaJIT的变量实现-TValue","viewCount":8},{"commentCount":10,"id":519598,"title":"Lua包管理工具Luarocks详解","viewCount":3827}]
         * abstract : 不过大部分手机闹钟都不支持这种以小时为单位的周期闹铃。所以，我以前每次都是都手动调整闹钟时间。总感觉有点 Low！于是，我就写了个简单的发邮件的 Lua 脚本，放到树莓派上作为一个shell命令使用;然后在每周一到周五的9点至23点整点各执行一次发邮件的操作。邮件是发到了我的 QQ 邮箱。收到QQ邮件后，左上角会有一个通知悬浮窗，体验比手机的震动声好了很多。
         * author : ios122
         * authorId : 2439023
         * authorPortrait : https://static.oschina.net/uploads/user/1219/2439023_50.jpeg?t=1500749731000
         * authorRelation : 4
         * body : <h2>背景介绍</h2>
         <p><img src="http://www.oschina.net/action/blog/img_proxy?url=http%3A%2F%2Fupload-images.jianshu.io%2Fupload_images%2F1081577-b83dc0a1e35fdc94.png%3FimageMogr2%2Fauto-orient%2Fstrip%257CimageView2%2F2%2Fw%2F1240" alt="show.png"></p>
         <p>我有一个习惯，定闹钟每隔60分钟左右，提醒自己休息一次。我发现自己有时候长时间思考，很容易拘泥于细节之中。适当的简单休息过后，往往会对正在解决和处理的问题有新的认识和发现，有事半功倍的奇效。</p>
         <p>不过大部分手机闹钟都不支持这种以小时为单位的周期闹铃。所以，我以前每次都是都手动调整闹钟时间。总感觉有点 Low！于是，我就写了个简单的发邮件的 Lua 脚本，放到树莓派上作为一个shell命令使用;然后在每周一到周五的9点至23点整点各执行一次发邮件的操作。邮件是发到了我的 QQ 邮箱。收到QQ邮件后，左上角会有一个通知悬浮窗，体验比手机的震动声好了很多。</p>
         <p>另外，之所以会选择使用 Lua 语言，只是最近自己刚好在看 Lua 而已，用其他语言也是可以的。</p>
         <h2>在树莓派上配置必要的 Lua 环境</h2>
         <h3>安装 LuaJIT</h3>
         <p>树莓派的 debian 官方推荐定制系统，内置有 <em>Lua 5.1.5</em>.但是 LuaJIT 使用了 JIT 技术，执行效率更高，所以更推荐安装和使用。<em>LuaJIT</em> 对应的也是 <em>Lua 5.1</em> 的语法。</p>
         <p>你可以在 <a href="http://luajit.org/download.html" rel="nofollow">LuaJIT 下载页</a> 右键查看最新的 LuaJIT 稳定版本，然后参照执行：</p>
         <pre><code>wget http://luajit.org/download/LuaJIT-2.0.5.tar.gz
         tar xzf LuaJIT-2.0.5.tar.gz
         cd LuaJIT-2.0.5
         make &amp;&amp; sudo make install
         </code></pre>
         <p>验证是否安装成功，请执行：</p>
         <pre><code>luajit -v
         </code></pre>
         <p>安装成功，会输出：</p>
         <pre><code>LuaJIT 2.0.5 -- Copyright (C) 2005-2017 Mike Pall. http://luajit.org/
         </code></pre>
         <h3>安装 luarocks</h3>
         <p>luarocks 是 Lua 的包管理工具。在树莓派上需要从源码安装 luarocks 。这需要一些技巧。</p>
         <p>你可以到 <a href="https://github.com/luarocks/luarocks/wiki/Download" rel="nofollow">luarocks下载页</a> 查看最新的luarocks版本，然后参考执行以下命令：</p>
         <pre><code>wget http://luarocks.github.io/luarocks/releases/luarocks-2.4.3.tar.gz
         tar xzf luarocks-2.4.3.tar.gz
         cd luarocks-2.4.3
         </code></pre>
         <p>luarocks 在编译前，需要先进行配置。完整的配置内容，参见：<a href="https://github.com/luarocks/luarocks/wiki/Installation-instructions-for-Unix#Customizing_your_settings" rel="nofollow">Customizing your settings</a>。基于 LuaJIT 的配置命令如下：</p>
         <pre><code>./configure --lua-suffix="jit"
         </code></pre>
         <p>然后编译安装：</p>
         <pre><code>make build
         sudo make install
         </code></pre>
         <p>验证是否安装成功：</p>
         <pre><code>luarocks
         </code></pre>
         <h3>安装 luasocket</h3>
         <p>luasocket 这个库，下面的代码会用到，需要提前安装下。 如果 luarocks 安装成功，那其他的 lua 库安装就非常简单了：</p>
         <pre><code>sudo luarocks install luasocket
         </code></pre>
         <h2>简单的 Lua 脚本： 发送邮件提示自己注意休息</h2>
         <p>新建一个 rest_reminder.lua 文件</p>
         <pre><code>vi rest_reminder.lua
         </code></pre>
         <p>然后输入以下 Lua 代码：</p>
         <pre><code>#!/usr/bin/env luajit
         local smtp = require("socket.smtp")
         from = "username@exapmle.com" --发件人
         --收件人列表
         rcpt = {
         "your_qq_number@qq.com"
         }
         mesgt = {
         headers = { -- 只是文字显示内容.
         to = "your_qq_number@qq.com", --收件人
         subject = "请休息五分钟!" --主题
         },
         body = "您已连续思考一小时,请先休息五分钟吧!"
         }
         r, e = smtp.send{
         from = from,
         rcpt = rcpt,
         source = smtp.message(mesgt),
         server = "smtp.example.com",
         user = "username@exapmle.com",
         password = "username_pwd"
         }
         if not r then
         print(e)
         else
         print("发送成功!")
         end
         </code></pre>
         <p>如果你想实现一些更复杂的操作，最好在常用电脑上<a href="http://www.cnblogs.com/ios122/p/7819242.html" rel="nofollow">配置一个 Lua 完整的开发环境</a>。</p>
         <p>想要文件能执行当做命令执行，还需要给文件添加可执行权限：</p>
         <pre><code>chmod +x ./rest_reminder.lua
         </code></pre>
         <p>测试代码是否有效：</p>
         <pre><code>./rest_reminder.lua
         </code></pre>
         <p>正常执行的话，你的收件人邮箱（或邮件垃圾箱），应该会收到一封邮箱。</p>
         <p><img src="http://www.oschina.net/action/blog/img_proxy?url=http%3A%2F%2Fupload-images.jianshu.io%2Fupload_images%2F1081577-ee57bc4e0dcf35bd.png%3FimageMogr2%2Fauto-orient%2Fstrip%257CimageView2%2F2%2Fw%2F1240" alt="test.png"></p>
         <p>注意：</p>
         <ul>
         <li><strong>headers</strong> 中的收件人会显示在邮件头，但是真正决定发送给谁的是 <strong>rcpt</strong></li>
         <li><strong>smtp.example.com</strong> 要改为发信邮箱的 smtp 服务器。</li>
         <li><strong><a href="mailto:username@exapmle.com" rel="nofollow">username@exapmle.com</a></strong> 和 <strong>username_pwd</strong> 要改为真实的邮件用户名和密码</li>
         <li>部分邮箱的 smtp 功能，可能需要单独开通。</li>
         </ul>
         <h2>使用 crontab 来定时执行</h2>
         <p>crontab 简单实用，如果不是很熟悉，可以把它简单当做一个高度自定义的定时器。</p>
         <p>假设脚本的完整路径是 <strong>/home/pi/task/rest_reminder.lua</strong> 。</p>
         <p>执行：</p>
         <pre><code>crontab -e
         </code></pre>
         <p>在打开的内容区末尾新增：</p>
         <pre><code>00  9-23  *  *  *  /home/pi/task/rest_reminder.lua
         </code></pre>
         <p>保存退出，正常应该会看到提示：</p>
         <pre><code>crontab: installing new crontab
         </code></pre>
         <p>此时，我们的定时脚本已经生效了。即使重启电脑，这个脚本依然可以正常定时执行。</p>
         <p>crontab 借助于 cron 服务。在必要时，你可以使用 sytemed 的命令来操作 cron 服务：</p>
         <pre><code># 查看状态
         sudo systemctl status cron
         # 激活服务
         sudo systemctl enable cron
         </code></pre>
         <h2>参考文档</h2>
         <ul>
         <li><a href="http://www.cnblogs.com/ios122/p/7819242.html" rel="nofollow">【LuaJIT版】从零开始在 macOS 上配置 Lua 开发环境</a></li>
         <li><a href="https://github.com/luarocks/luarocks/wiki/Installation-instructions-for-Unix" rel="nofollow">Installation instructions for Unix</a></li>
         <li><a href="http://curran.blog.51cto.com/2788306/1391816" rel="nofollow">Lua smtp</a></li>
         <li><a href="https://segmentfault.com/a/1190000002628040" rel="nofollow">Linux 下执行定时任务 crontab 命令详解</a></li>
         <li><a href="http://linuxtools-rst.readthedocs.io/zh_CN/latest/tool/crontab.html#id10" rel="nofollow">crontab 使用实例</a></li>
         <li><a href="http://www.jianshu.com/p/ff2f0a2b481c" rel="nofollow">强大的crontab</a></li>
         </ul>
         * catalog : 颜风的歌
         * commentCount : 2
         * comments : [{"appClient":0,"author":"蓝水晶飞机","authorId":1269352,"authorPortrait":"https://static.oschina.net/uploads/user/634/1269352_50.jpg?t=1484488391000","content":"哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。","id":302158636,"pubDate":"2017-11-16 08:46:20"},{"appClient":0,"author":"ios122","authorId":2439023,"authorPortrait":"https://static.oschina.net/uploads/user/1219/2439023_50.jpeg?t=1500749731000","content":"用自己喜欢的姿势:smile:","id":302159123,"pubDate":"2017-11-16 09:26:55","refer":{"author":"蓝水晶飞机","content":"哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。"}}]
         * favorite : false
         * href : https://my.oschina.net/ios122/blog/1574239
         * id : 1574239
         * original : true
         * payNotify : https://my.oschina.net/action/blog/paySuccess
         * pubDate : 2017-11-16 00:54:20
         * recommend : true
         * title : 【树莓派自动化应用实例】整点提醒自己休息五分钟
         * type : 1
         * viewCount : 164
         */

        @SerializedName("abstract")
        private String abstractX;
        private String author;
        private int authorId;
        private String authorPortrait;
        private int authorRelation;
        private String body;
        private String catalog;
        private int commentCount;
        private boolean favorite;
        private String href;
        private int id;
        private boolean original;
        private String payNotify;
        private String pubDate;
        private boolean recommend;
        private String title;
        private int type;
        private int viewCount;
        private List<AboutsBean> abouts;
        private List<CommentsBean> comments;

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getAuthorId() {
            return authorId;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public String getAuthorPortrait() {
            return authorPortrait;
        }

        public void setAuthorPortrait(String authorPortrait) {
            this.authorPortrait = authorPortrait;
        }

        public int getAuthorRelation() {
            return authorRelation;
        }

        public void setAuthorRelation(int authorRelation) {
            this.authorRelation = authorRelation;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public boolean isFavorite() {
            return favorite;
        }

        public void setFavorite(boolean favorite) {
            this.favorite = favorite;
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

        public String getPayNotify() {
            return payNotify;
        }

        public void setPayNotify(String payNotify) {
            this.payNotify = payNotify;
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

        public List<AboutsBean> getAbouts() {
            return abouts;
        }

        public void setAbouts(List<AboutsBean> abouts) {
            this.abouts = abouts;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public static class AboutsBean {
            /**
             * commentCount : 0
             * id : 1571602
             * title : 【LuaJIT版】从零开始在 macOS 上配置 Lua 开发环境
             * viewCount : 177
             */

            private int commentCount;
            private int id;
            private String title;
            private int viewCount;

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }

        public static class CommentsBean {
            /**
             * appClient : 0
             * author : 蓝水晶飞机
             * authorId : 1269352
             * authorPortrait : https://static.oschina.net/uploads/user/634/1269352_50.jpg?t=1484488391000
             * content : 哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。
             * id : 302158636
             * pubDate : 2017-11-16 08:46:20
             * refer : {"author":"蓝水晶飞机","content":"哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。"}
             */

            private int appClient;
            private String author;
            private int authorId;
            private String authorPortrait;
            private String content;
            private int id;
            private String pubDate;
            private ReferBean refer;

            public int getAppClient() {
                return appClient;
            }

            public void setAppClient(int appClient) {
                this.appClient = appClient;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getAuthorId() {
                return authorId;
            }

            public void setAuthorId(int authorId) {
                this.authorId = authorId;
            }

            public String getAuthorPortrait() {
                return authorPortrait;
            }

            public void setAuthorPortrait(String authorPortrait) {
                this.authorPortrait = authorPortrait;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
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

            public ReferBean getRefer() {
                return refer;
            }

            public void setRefer(ReferBean refer) {
                this.refer = refer;
            }

            public static class ReferBean {
                /**
                 * author : 蓝水晶飞机
                 * content : 哈哈哈，想法不错，虽然其实树莓派的重点不在这。 在树莓派上面跑Java、Python，也是挺好玩的。
                 */

                private String author;
                private String content;

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }
        }
    }
}
