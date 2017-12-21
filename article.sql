create table article_info_tbl(
	id int(11) primary key auto_increment comment,
	title varchar(256) NOT NULL comment '文章标题',
	source varchar(64) NOT NULL comment '文章来源',
	content varchar(32) NOT NULL comment '文章内容',
	rate int(3) NOT NULL comment '文章评分',
	pub_time bigint NOT NULL comment '文章发表时间',
	pub_user_id int(11) NOT NULL comment '发布人的用户'，
	view_count int(8) NOT NULL comment '用户观看次数',
	reply_count int(8) NOT NULL comment '用户评论条数'，
	creater_user int(11) NOT NULL comment '创建人',
	status int(2) NOT NULL comment '文章状态 0：新建 1：有效 -1：失效   具体见代码code定义'
)ENGINE=innoDB, CHARSET=utf8

create table article_cate_rela_info_tbl(
	id int(11) primary key auto_increment,
	article_id int(11) NOT NULL comment '文章id',
	category_id int(11) NOT NULL comment '分类id',
	pub_time bigint NOT NULL comment '发布时间',
	creater_user int(11) NOT NULL comment '创建人',
	status int(2) NOT NULL comment '分类关联状态'
)

create table category_tbl_info_tbl(
	id int(11) primary key auto_increment,
	category_id int(11) NOT NULL comment '',
	category_name varchar(16) NOT NULL comment '分类名称',
	pub_time bigint NOT NULL comment '发布时间',
	status int(2) NOT NULL comment '文章状态',
	last_create_user int(11) NOT NULL comment '最后修改人呢',
	creater_user int(11) NOT NULL comment '创建人'
)
