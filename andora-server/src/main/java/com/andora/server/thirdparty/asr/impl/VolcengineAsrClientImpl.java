package com.andora.server.thirdparty.asr.impl;

import com.andora.server.thirdparty.asr.AsrClient;
import com.andora.server.thirdparty.asr.dto.AsrRequestDTO;
import com.andora.server.thirdparty.asr.dto.AsrResponseDTO;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * .
 * doc https://www.volcengine.com/docs/6561/109880
 *
 * @author: leven.chen
 * @date: 2024/3/24 19:22
 */
@Component("volcengineAsrClient")
public class VolcengineAsrClientImpl implements AsrClient {
    @Override
    public AsrResponseDTO voicRrecognition(AsrRequestDTO request) {
        return null;
    }

    @Override
    public void voicRrecognition(AsrRequestDTO request, Consumer<AsrResponseDTO> consumer) {

    }
}
