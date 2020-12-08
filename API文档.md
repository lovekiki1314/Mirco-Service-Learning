## API文档

[TOC]

### Gateway

*URL* `http://localhost:8080`

### UserService

#### GET `/welcome`

获取欢迎消息

- Parameter
  - 无
- Response
  - 欢迎消息

#### POST `/register`

注册新用户

- Request body
  - 注册请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### POST `/login`

用户登录

- Request body
  - 登录请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户名、token

#### GET `/user/userinfo`

通过用户名获取用户信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户信息

#### GET `/user/userinfoByID`

通过用户ID获取用户信息

- Parameter
  - 用户ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户信息

#### GET `/user/userinfoByEmail`

通过邮箱获取用户信息

- Parameter
  - 邮箱
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户信息

#### GET `/user/undealedNotifications`

获取程序委员`pc member`所有未处理的邀请消息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：邀请消息

#### GET `/user/undealedNotificationsNum`

获取程序委员`pc member`未处理邀请消息的数量

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：邀请消息的数量

#### GET `/user/userinfoByFullnameAndEmail`

通过全名和邮箱获取用户信息

- Parameter
  - 全名
  - 邮箱
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户信息

#### GET `/util/users`

通过全名获取多个用户信息

- Parameter
  - 全名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：用户信息

### MeetingService

#### GET `/welcome`

获取欢迎消息

- Parameter
  - 无
- Response
  - 欢迎消息

#### POST `/meeting/application`

添加新的会议

- Request body
  - 添加会议请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/meeting/meetingInfo`

获取会议信息

- Parameter
  - 会议名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### POST `/meeting/saveMeeting`

保存会议

- Request body
  - 会议
- Response
  - 无

#### GET `/meeting/meetingInfoById`

通过会议ID获取会议信息

- Parameter
  - 会议ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### POST `/meeting/pcmInvitation`

向程序委员`pc member`发送邀请

- Request body
  - 邀请请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/meeting/invitationStatus`

获取会议中所有程序委员`pc member`的邀请状态

- Parameter
  - 会议名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`pc member`的信息和邀请状态

#### GET `/admin/queueingApplication`

获取所有待处理会议的信息

- Parameter
  - 无
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### GET `/admin/alreadyApplication`

获取所有已处理会议的信息

- Parameter
  - 无
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### POST `/admin/ratify`

审批已存在的会议

- Request body
  - 审批请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/meeting/chairMeeting`

获取会议主席`chair`的所有会议信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### GET `/meeting/pcMemberMeeting`

获取程序委员`pc member`的所有会议信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### GET `/meeting/authorMeeting`

获取文稿作者`author`的所有会议信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### GET `/meeting/availableMeeting`

获取用户可投稿的所有会议信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：会议信息

#### GET `/meeting/undealedNotifications`

获取程序委员`pc member`所有未处理的邀请信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：邀请信息

#### POST `/meeting/beginSubmission`

会议开始接受投稿

- Request body
  - 开始投稿请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### POST `/meeting/invitationRepo`

处理程序委员`pc member`所有未处理的邀请

- Request body
  - 处理邀请请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/meeting/alreadyDealedNotifications`

获取程序委员`pc member`所有已处理的邀请信息

- Parameter
  - 用户名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：邀请信息

#### POST `/meeting/beginReview`

会议开始审稿

- Request body
  - 开始审稿请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/meeting/submissionList`

获取文稿作者`author`的投稿文章列表

- Parameter
  - 用户名
  - 会议名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：文章信息

#### POST `/meeting/publish`

修改会议状态为：结果已发布

- Request body
  - 修改会议状态请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### POST `/meeting/finalPublish`

修改会议状态为：审稿意见已发布

- Request body
  - 修改会议状态请求
- Response
  - 响应码：`200`
  - 响应消息：`success` 或 失败信息
  - 响应体：`null`

#### GET `/meeting/getPCMemberRelationByIdAndStatus`

根据ID和状态获取程序委员`pc mebmer`的关系列表

- Parameter
  - 用户ID
  - 状态
- Response
  - 关系列表

### ArticleService

#### GET `/article/articleDetail`

获取文章信息

- Parameter
  - 文章ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：文章信息

#### POST `/article/articleSubmission`

提交新的文章

- Parameter
  - 文章详细信息
  - 客户端请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### POST `/article/updateArticle`

更新已有的文章

- Parameter
  - 文章详细信息
  - 客户端请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/article/reviews`

获取文章的所有审稿意见

- Parameter
  - 文章ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：审稿意见

#### GET `/article/reviewArticles`

获取程序委员`pc member`的所有审稿文章信息

- Parameter
  - 用户名
  - 会议名
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：文章信息

#### GET `/article/reviewArticle`

获取程序委员`pc member`的单个审稿文章信息

- Parameter
  - 用户名
  - 文章ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：文章信息

#### GET `/article/alreadyReviewedInfo`

获取程序委员`pc member`关于单个文章的审稿意见

- Parameter
  - 用户名
  - 文章ID
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：审稿意见

#### POST `/article/reviewer`

提交审稿意见

- Request body
  - 审稿请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### POST `/article/reviewConfirm`

确认审稿状态

- Request body
  - 确认审稿状态请求
- Response
  - 响应码：`200`
  - 响应消息：`success` 或 失败信息
  - 响应体：`null`

#### POST `/article/rebuttal`

提交辩驳意见

- Request body
  - 辩驳请求
- Response
  - 响应码：`200`
  - 响应消息：`success` 或 失败信息
  - 响应体：`null`

#### GET `/article/rebuttalInfo`

获取文章的辩驳意见

- Parameter
  - 文章ID
- Response
  - 响应码：`200`
  - 响应消息：`success` 或 失败信息
  - 响应体：辩驳意见 或 `null`

#### POST `/article/updateReview`

更新审稿意见

- Request body
  - 更新审稿意见请求
- Response
  - 响应码：`200`
  - 响应消息：`success` 或 失败信息
  - 响应体：`null`

#### POST `/article/reviewPost`

发布讨论信息

- Request body
  - 发布讨论信息请求
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：`null`

#### GET `/article/postList`

获取讨论信息

- Parameter
  - 文章ID
  - 讨论信息状态
- Response
  - 响应码：`200`
  - 响应消息：`success`
  - 响应体：讨论信息