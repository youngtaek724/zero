package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class EaiRestDTO {

    // Header fields
    private String ifId;
    private String ifVer;
    private String ifSenderGrp;
    private String ifSender;
    private String ifReceiverGrp;
    private String ifReceiver;
    private String ifTrackingId;
    private String ifDateTime;

    // Payload fields
    private String id;
    private String name;
    private String phone;
    private String address;
    private String flag;

    private EaiRestDTO(Builder builder) {
        this.ifId = builder.ifId;
        this.ifVer = builder.ifVer;
        this.ifSenderGrp = builder.ifSenderGrp;
        this.ifSender = builder.ifSender;
        this.ifReceiverGrp = builder.ifReceiverGrp;
        this.ifReceiver = builder.ifReceiver;
        this.ifTrackingId = builder.ifTrackingId;
        this.ifDateTime = builder.ifDateTime;
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
        this.address = builder.address;
        this.flag = builder.flag;
    }

    // Static inner Builder class
    public static class Builder {
        // Header fields
        private String ifId;
        private String ifVer;
        private String ifSenderGrp;
        private String ifSender;
        private String ifReceiverGrp;
        private String ifReceiver;
        private String ifTrackingId;
        private String ifDateTime;

        // Payload fields
        private String id;
        private String name;
        private String phone;
        private String address;
        private String flag;

        // Builder methods for setting each field, returning the builder itself for chaining
        public Builder ifId(String ifId) {
            this.ifId = ifId;
            return this;
        }

        public Builder ifVer(String ifVer) {
            this.ifVer = ifVer;
            return this;
        }

        public Builder ifSenderGrp(String ifSenderGrp) {
            this.ifSenderGrp = ifSenderGrp;
            return this;
        }

        public Builder ifSender(String ifSender) {
            this.ifSender = ifSender;
            return this;
        }

        public Builder ifReceiverGrp(String ifReceiverGrp) {
            this.ifReceiverGrp = ifReceiverGrp;
            return this;
        }

        public Builder ifReceiver(String ifReceiver) {
            this.ifReceiver = ifReceiver;
            return this;
        }

        public Builder ifTrackingId(String ifTrackingId) {
            this.ifTrackingId = ifTrackingId;
            return this;
        }

        public Builder ifDateTime(String ifDateTime) {
            this.ifDateTime = ifDateTime;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder flag(String flag) {
            this.flag = flag;
            return this;
        }

        // Build method to create the final DTO object
        public EaiRestDTO build() {
            return new EaiRestDTO(this);
        }
    }

}