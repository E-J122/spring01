package cn.edu.scujcc.dao;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.edu.scujcc.model.Channel;
@Repository
public interface ChannelRepository extends MongoRepository<Channel,String> {
	public List<Channel> findByTitle(String t);
	public List<Channel> findByQuality(String q);
	//找出评论时间在指定日期之后的所有频道
	public List<Channel> findByCommentsDtAfter(LocalDateTime theDt);
}
