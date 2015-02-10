/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.infrastructure.messaging.aws;

public interface SqsQueueFactory {

    /**
     * Creates an {@link SqsQueue} which is subscribed to the given {@link SnsTopic}s. An actual AWS SQS queue is
     * created if one does not already exist with the given name. The topic subscriptions (and a compatible queue
     * policy) are always updated, whether or not the AWS SQS queue already exists.
     * @param name Queue name
     * @param snsTopics {@link SnsTopic}s to subscribe to
     * @return {@link SqsQueue} with the given name, subscribed to the specified topics.
     */
    SqsQueue createSqsQueue(String name, SnsTopic... snsTopics);

    /**
     * Creates an {@link SqsQueue} without any topic subscriptions. An actual AWS SQS queue is created if one does not
     * already exist with the given name. The queue policy is always updated, whether or not the AWS SQS queue already
     * exists.
     * @param name Queue name
     * @return {@link SqsQueue} with the given name
     */
    // SqsQueue createSqsQueue(String name);
}
