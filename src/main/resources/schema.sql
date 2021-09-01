
CREATE TABLE if not exists "wallet_tbl"
(
    transcation_id bigserial NOT NULL ,
    transaction_timestamp timestamp  NOT NULL,
    amount bigint NOT NULL,
    remark character(100) COLLATE pg_catalog."default",
    register_timestamp timestamp NOT NULL,
    CONSTRAINT wallet_tbl_pkey PRIMARY KEY (transcation_id)
);

