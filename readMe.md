### 分布式oauth2流程
#### **1.获取授权码**
#####1.1浏览器访问获取授权码，参数信息和AuthorizationConfig配置一致:
`http://127.0.0.1:53010/uaa/oauth/authorize?client_id=resource1&response_type=code&scope=all&redirect_uri=http://www.baidu.com`
###### 实践后发现这个url也可以，所以scope和redirect_uri参数值无关（参数可以没有但不能错误）
`http://127.0.0.1:53010/uaa/oauth/authorize?client_id=resource1&response_type=code`
##### 1.2 登录
userName:user1
password:user1
登录成功后跳转授权页面
##### 1.3 点击授权后成功跳转www.baidu.com
#### **2.获取token**
##### 2.1 参数
`http://127.0.0.1:53010/uaa/oauth/token`
<table>
    <tr>
        <td>key</td><td>value</td><td>备注</td>
    </tr>
    <tr>
        <td>client_id</td><td>resource1</td><td></td>
    </tr>
    <tr>
        <td>client_secret</td><td>resource1</td><td></td>
    </tr>
    <tr>
        <td>grant_type</td><td>authorization_code</td><td></td>
    </tr>
    <tr>
        <td>code</td><td>vlHZnP</td><td>授权码为动态获取</td>
    </tr>
    <tr>
        <td>redirect_uri</td><td>http://www.baidu.com</td><td></td>
    </tr>
</table>
##### 2.2 结果
`{
     "access_token": "0600009a-4e41-415f-a616-4275751c7bac",
     "token_type": "bearer",
     "refresh_token": "b740b82d-8886-483a-a953-5c0b0cf94e9d",
     "expires_in": 7199,
     "scope": "all"
 }`


