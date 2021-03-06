package cn.antigenmhc.otaku.service.ucenter.mapper;

import cn.antigenmhc.otaku.service.base.dto.RegisterDto;
import cn.antigenmhc.otaku.service.ucenter.pojo.Member;
import cn.antigenmhc.otaku.service.ucenter.pojo.vo.RegisterVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author antigenmhc
 * @since 2021-01-29
 */
public interface MemberMapper extends BaseMapper<Member> {

    RegisterDto getRegisterNumByDate(String date);
}
